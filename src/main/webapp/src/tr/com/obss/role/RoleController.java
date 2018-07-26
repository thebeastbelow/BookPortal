package tr.com.obss.role;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private RoleService roleService;

    protected RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public Iterable<Role> getAllRoles() {
        return roleService.findAll();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable int id) {
        return roleService.findById(id);
    }

    @GetMapping("/role/{role}")
    public Role getRoleByRole(@PathVariable String role) {
        return roleService.findByRole(role);
    }

    @PostMapping
    public void addRole(@RequestBody Role role) {
        roleService.save(role);
    }

    @PutMapping("/{id}")
    public void updateRole(@PathVariable int id, @RequestBody Role newRole) {
        roleService.updateRoleById(id, newRole);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable int id) {
        roleService.deleteById(id);
    }

}
