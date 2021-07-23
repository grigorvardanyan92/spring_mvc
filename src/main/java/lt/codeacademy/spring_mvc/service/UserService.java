package lt.codeacademy.spring_mvc.service;

import lt.codeacademy.spring_mvc.entity.User;
import lt.codeacademy.spring_mvc.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public User saveUserIfNotExists(User user) {
        return
    }
}
