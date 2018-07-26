package tr.com.obss.author;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private AuthorService authorService;

    protected AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public Iterable<Author> getAllAuthors() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable int id) {
        return authorService.findById(id);
    }

    @GetMapping("/name/{name}")
    public Iterable<Author> getAuthorsByName(@PathVariable String name) {
        return authorService.findByName(name);
    }

    @GetMapping("/surname/{surname}")
    public Iterable<Author> getAuthorBySurname(@PathVariable String surname) {
        return authorService.findBySurname(surname);
    }

    @PostMapping
    public void addAuthor(@RequestBody Author author) {
        authorService.save(author);
    }

    @PutMapping("/{id}")
    public void updateAuthor(@PathVariable int id, @RequestBody Author newAuthor) {
        authorService.updateAuthorById(id, newAuthor);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id) {
        authorService.deleteById(id);
    }

}
