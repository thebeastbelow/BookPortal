package tr.com.obss.author;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    AuthorDao authorDao;

    protected AuthorService(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    Iterable<Author> findAll() {
        return authorDao.findAll();
    }

    Author findById(Integer id) {
        return authorDao.findById(id).orElse(new Author());
    }

    Iterable<Author> findByName(String name) {
        return authorDao.findByName(name);
    }

    Iterable<Author> findBySurname(String surname) {
        return authorDao.findBySurname(surname);
    }


    Author save(Author author) {
        return authorDao.save(author);
    }

    void deleteById(Integer id) {
        authorDao.findById(id).ifPresent((author) -> {
            authorDao.deleteById(id);
        });
    }

    void updateAuthorById(Integer id, Author newAuthor) {
        authorDao.findById(id).ifPresent((Author author) -> {
            author.setName(newAuthor.getName());
            author.setSurname(newAuthor.getSurname());
            authorDao.save(author);
        });
    }
}
