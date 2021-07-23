package lt.codeacademy.spring_mvc.repository;

import lt.codeacademy.spring_mvc.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
}
