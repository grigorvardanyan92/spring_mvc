package lt.codeacademy.spring_mvc.repository;

import lt.codeacademy.spring_mvc.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public Optional<User> getUserByPassword(String password);
}
