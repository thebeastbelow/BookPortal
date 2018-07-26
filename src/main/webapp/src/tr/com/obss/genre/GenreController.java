package tr.com.obss.genre;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genres")
public class GenreController {
    private GenreService genreService;

    protected GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping
    public Iterable<Genre> getAllGenres() {
        return genreService.findAll();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable int id) {
        return genreService.findById(id);
    }

    @GetMapping("/genre/{genre}")
    public Genre getGenreByGenre(@PathVariable String genre) {
        return genreService.findByGenre(genre);
    }

    @PostMapping
    public void addGenre(@RequestBody Genre genre) {
        genreService.save(genre);
    }

    @PutMapping("/{id}")
    public void updateGenre(@PathVariable int id, @RequestBody Genre newGenre) {
        genreService.updateGenreById(id, newGenre);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable int id) {
        genreService.deleteById(id);
    }

}
