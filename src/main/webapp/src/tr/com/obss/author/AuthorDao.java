package tr.com.obss.author;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuthorDao {
    AuthorRepository authorRepository;

    protected AuthorDao(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    Iterable<Author> findAll() {
        return authorRepository.findAll();
    }

    Optional<Author> findById(Integer id) {
        return authorRepository.findById(id);
    }

    Iterable<Author> findByName(String name) {
        return authorRepository.findByName(name);
    }
    Iterable<Author> findBySurname(String surname) {
        return authorRepository.findBySurname(surname);
    }


    Author save(Author author) {
        return authorRepository.save(author);
    }

    void deleteById(Integer id) {
        authorRepository.deleteById(id);
    }
}
