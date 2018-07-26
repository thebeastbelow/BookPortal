package tr.com.obss.role;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RoleDao {
    RoleRepository roleRepository;

    protected RoleDao(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    Optional<Role> findById(Integer id) {
        return roleRepository.findById(id);
    }

    Optional<Role> findByRole(String role) {
        return roleRepository.findByRole(role);
    }

    Role save(Role role) {
        return roleRepository.save(role);
    }

    void deleteById(Integer id) {
        roleRepository.deleteById(id);
    }
}
