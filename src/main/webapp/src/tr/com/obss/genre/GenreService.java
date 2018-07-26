package tr.com.obss.genre;

import org.springframework.stereotype.Service;

@Service
public class GenreService {
    GenreDao genreDao;

    protected GenreService(GenreDao genreDao) {
        this.genreDao = genreDao;
    }

    Iterable<Genre> findAll() {
        return genreDao.findAll();
    }

    Genre findById(Integer id) {
        return genreDao.findById(id).orElse(new Genre());
    }

    Genre findByGenre(String genre) {
        return genreDao.findByGenre(genre).orElse(new Genre());
    }

    Genre save(Genre genre) {
        return genreDao.save(genre);
    }

    void deleteById(Integer id) {
        genreDao.findById(id).ifPresent(genre -> {
            genreDao.deleteById(id);
        });
    }

    void updateGenreById(Integer id, Genre newGenre) {
        genreDao.findById(id).ifPresent((Genre genre) -> {
            genre.setGenre(newGenre.getGenre());
            genreDao.save(genre);
        });
    }
}
