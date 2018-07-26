package tr.com.obss.role;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Integer> {
    @Override
    Iterable<Role> findAll();
    @Override
    Optional<Role> findById(Integer id);
    Optional<Role> findByRole(String role);
    @Override
    Role save(Role entity);
    @Override
    void deleteById(Integer integer);
}
