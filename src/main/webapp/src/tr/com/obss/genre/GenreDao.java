package tr.com.obss.genre;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GenreDao {
    GenreRepository genreRepository;

    protected GenreDao(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    Iterable<Genre> findAll() {
        return genreRepository.findAll();
    }

    Optional<Genre> findById(Integer id) {
        return genreRepository.findById(id);
    }

    Optional<Genre> findByGenre(String genre) {
        return genreRepository.findByGenre(genre);
    }

    Genre save(Genre genre) {
        return genreRepository.save(genre);
    }

    void deleteById(Integer id) {
        genreRepository.deleteById(id);
    }
}
