package tr.com.obss.role;

import org.springframework.stereotype.Service;

@Service
public class RoleService {
    RoleDao roleDao;

    protected RoleService(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    Iterable<Role> findAll() {
        return roleDao.findAll();
    }

    Role findById(Integer id) {
        return roleDao.findById(id).orElse(new Role());
    }

    Role findByRole(String role) {
        return roleDao.findByRole(role).orElse(new Role());
    }

    Role save(Role role) {
        return roleDao.save(role);
    }

    void deleteById(Integer id) {
        roleDao.findById(id).ifPresent(role -> {
            roleDao.deleteById(id);
        });
    }

    void updateRoleById(Integer id, Role newRole) {
        roleDao.findById(id).ifPresent((Role role) -> {
            role.setRole(newRole.getRole());
            roleDao.save(role);
        });
    }
}
