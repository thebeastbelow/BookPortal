package tr.com.obss.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserDao userDao;

    protected UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    Iterable<User> findAll() {
        return userDao.findAll();
    }

    User findById(Integer id) {
        return userDao.findById(id).orElse(new User());
    }

    User findByUsername(String username) {
        return userDao.findByUsername(username).orElse(new User());
    }
    Iterable<User> findByName(String name) {
        return userDao.findByName(name);
    }

    Iterable<User> findBySurname(String surname) {
        return userDao.findBySurname(surname);
    }
    User findByEmail(String email) {
        return userDao.findByEmail(email).orElse(new User());
    }


    User save(User user) {
        return userDao.save(user);
    }

    void deleteById(Integer id) {
        userDao.findById(id).ifPresent(user-> {
            userDao.deleteById(id);
        });
    }

    void updateUserById(Integer id, User newUser) {
        userDao.findById(id).ifPresent((User user) -> {
            user.setUsername(newUser.getUsername());
            user.setPassword(newUser.getPassword());
            user.setName(newUser.getName());
            user.setSurname(newUser.getSurname());
            user.setEmail(newUser.getEmail());
            user.setRole(newUser.getRole());
            userDao.save(user);
        });
    }
}
