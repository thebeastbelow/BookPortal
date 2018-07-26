package tr.com.obss.author;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue
    @Column(name = "Author_id")
    private Integer id;
    @Column(name = "Author_name")
    private String name;
    @Column(name = "Author_surname")
    private String surname;

    public Author() {
        this.id = 0;
        this.name = "";
        this.surname = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
