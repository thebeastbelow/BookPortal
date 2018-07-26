package tr.com.obss.book;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookDao {
    BookRepository bookRepository;

    protected BookDao(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    Optional<Book> findById(Integer id) {
        return bookRepository.findById(id);
    }

    Optional<Book> findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    Iterable<Book> findByName(String name) {
        return bookRepository.findByName(name);
    }

    Book save(Book book) {
        return bookRepository.save(book);
    }

    void deleteById(Integer id) {
        bookRepository.deleteById(id);
    }
}
