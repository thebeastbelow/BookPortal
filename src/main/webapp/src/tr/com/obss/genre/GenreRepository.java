package tr.com.obss.genre;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GenreRepository extends CrudRepository<Genre, Integer> {
    @Override
    Iterable<Genre> findAll();
    @Override
    Optional<Genre> findById(Integer id);
    Optional<Genre> findByGenre(String genre);
    @Override
    Genre save(Genre entity);
    @Override
    void deleteById(Integer integer);
}
