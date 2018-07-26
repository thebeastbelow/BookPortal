package tr.com.obss.book;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Integer> {
    @Override
    Iterable<Book> findAll();
    @Override
    Optional<Book> findById(Integer id);
    Optional<Book> findByIsbn(String isbn);
    Iterable<Book> findByName(String name);
    @Override
    Book save(Book entity);
    @Override
    void deleteById(Integer integer);
}
