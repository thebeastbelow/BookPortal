package tr.com.obss.author;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
    @Override
    Iterable<Author> findAll();
    @Override
    Optional<Author> findById(Integer id);
    Iterable<Author> findByName(String name);
    Iterable<Author> findBySurname(String surname);
    @Override
    Author save(Author entity);
    @Override
    void deleteById(Integer integer);
}
