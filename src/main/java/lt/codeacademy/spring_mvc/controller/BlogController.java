package lt.codeacademy.spring_mvc.controller;

import lt.codeacademy.spring_mvc.entity.Blog;
import lt.codeacademy.spring_mvc.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {

    private final BlogService service;

    public BlogController(BlogService service) {
        this.service = service;
    }

    @GetMapping("/blogs")
    public String blogs(Model model) {
        model.addAttribute("blogs", service.getAll());
        return "blogs/index";
    }

    @GetMapping("blogs/add")
    public String newBlog(Model model) {
        model.addAttribute("blog", new Blog());
        return "blogs/add";
    }

    @PostMapping("/blogs/add")
    public String newBlogForm(@ModelAttribute Blog blog) {  // https://spring.io/guides/gs/handling-form-submission/
        service.saveBlog(blog);
        return "redirect:/blogs";
    }

    @GetMapping("blogs/{id}/read")
    public String readBlog(@PathVariable Long id, Model model) {
        model.addAttribute("blog", service.getBlog(id));
        return "blogs/read";
    }

    @GetMapping("blogs/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("blog", service.getBlog(id));
        return "blogs/edit";
    }

    @PostMapping("blogs/{id}/edit")
    public String editSubmit(@PathVariable Long id, @ModelAttribute Blog blog) {
        service.saveBlog(blog);
        return "redirect:/blogs/" + id + "/read";
    }

    @GetMapping("/blogs/{id}/delete")
    public String deleteRequest(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:/blogs";
    }
}
