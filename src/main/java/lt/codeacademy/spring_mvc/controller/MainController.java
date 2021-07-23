package lt.codeacademy.spring_mvc.controller;

import lt.codeacademy.spring_mvc.entity.User;
import lt.codeacademy.spring_mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final UserService service;

    public MainController(UserService service) {
        this.service = service;
    }

    @GetMapping()
    public String homePage() {
        return "redirect:/blogs";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "sign_up";
    }

    @PostMapping("/register")
    public String registerFormSubmit(@ModelAttribute User user) {   // see BlogController.newBlogForm()

    }
}
