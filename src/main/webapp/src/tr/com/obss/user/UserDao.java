package tr.com.obss.user;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDao {
    UserRepository userRepository;

    protected UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    Iterable<User> findAll() {
        return userRepository.findAll();
    }

    Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }
    Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    Iterable<User> findByName(String name) {
        return userRepository.findByName(name);
    }
    Iterable<User> findBySurname(String surname) {
        return userRepository.findBySurname(surname);
    }

    Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    User save(User user) {
        return userRepository.save(user);
    }

    void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
