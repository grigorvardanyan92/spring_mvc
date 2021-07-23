package lt.codeacademy.spring_mvc.service;

import lt.codeacademy.spring_mvc.entity.Blog;
import lt.codeacademy.spring_mvc.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final BlogRepository repository;

    public BlogService(BlogRepository repository) {
        this.repository = repository;
    }

    public List<Blog> getAll() {
        return repository.findAll();
    }

    public Blog getBlog(Long id) {
        return repository.getById(id);
    }

    public Blog saveBlog(Blog blog) {
        return repository.save(blog);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
