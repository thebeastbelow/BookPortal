package tr.com.obss.user;

import tr.com.obss.role.Role;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name = "User_id")
    private Integer id;
    @Column(name = "User_username")
    private String username;
    @Column(name = "User_password")
    private String password;
    @Column(name = "User_name")
    private String name;
    @Column(name = "User_surname")
    private String surname;
    @Column(name = "User_email")
    private String email;
    @ManyToOne
    @JoinColumn(name = "User_roleId")
    private Role role;

    public User() {
        this.id = 0;
        this.username = "";
        this.password = "";
        this.name = "";
        this.surname = "";
        this.email = "";
        this.role = new Role();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
