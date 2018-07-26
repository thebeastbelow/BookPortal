package tr.com.obss.genre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    @GeneratedValue
    @Column(name = "Genre_id")
    private Integer id;
    @Column(name = "Genre_genre")
    private String genre;

    public Genre() {
        this.id = 0;
        this.genre = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
