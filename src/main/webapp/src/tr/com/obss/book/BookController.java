package tr.com.obss.book;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    protected BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.findById(id);
    }

    @GetMapping("/isbn/{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn) {
        return bookService.findByIsbn(isbn);
    }

    @GetMapping("/name/{name}")
    public Iterable<Book> getBooksByName(@PathVariable String name) {
        return bookService.findByName(name);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.save(book);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book newBook) {
        bookService.updateBookById(id, newBook);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteById(id);
    }

}
