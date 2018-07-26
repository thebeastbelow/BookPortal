package tr.com.obss.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    protected UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.findById(id);
    }

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/name/{name}")
    public Iterable<User> getUsersByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    @GetMapping("/surname/{surname}")
    public Iterable<User> getUsersBySurname(@PathVariable String surname) {
        return userService.findBySurname(surname);
    }

    @GetMapping("/email/{email}")
    public User getUserById(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.save(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User newUser) {
        userService.updateUserById(id, newUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteById(id);
    }

}
