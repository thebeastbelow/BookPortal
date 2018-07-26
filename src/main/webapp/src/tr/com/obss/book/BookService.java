package tr.com.obss.book;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    BookDao bookDao;

    protected BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    Iterable<Book> findAll() {
        return bookDao.findAll();
    }

    Book findById(Integer id) {
        return bookDao.findById(id).orElse(new Book());
    }

    Book findByIsbn(String isbn) {
        return bookDao.findByIsbn(isbn).orElse(new Book());
    }

    Iterable<Book> findByName(String name) {
        return bookDao.findByName(name);
    }

    Book save(Book book) {
        return bookDao.save(book);
    }

    void deleteById(Integer id) {
        bookDao.findById(id).ifPresent((book) -> {
            bookDao.deleteById(id);
        });
    }

    void updateBookById(Integer id, Book newBook) {
        bookDao.findById(id).ifPresent((Book book) -> {
            book.setName(newBook.getName());
            book.setIsbn(newBook.getIsbn());
            book.setAuthor(newBook.getAuthor());
            book.setGenre(newBook.getGenre());
            book.setImageLink(newBook.getImageLink());
            bookDao.save(book);
        });
    }
}
