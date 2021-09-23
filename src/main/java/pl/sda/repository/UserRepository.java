package pl.sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.model.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
