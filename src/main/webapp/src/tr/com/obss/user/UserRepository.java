package tr.com.obss.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Override
    Iterable<User> findAll();
    @Override
    Optional<User> findById(Integer id);
    Optional<User> findByUsername(String username);
    Iterable<User> findByName(String name);
    Iterable<User> findBySurname(String surname);
    Optional<User> findByEmail(String email);
    @Override
    User save(User entity);
    @Override
    void deleteById(Integer integer);
}
