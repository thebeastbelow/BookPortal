package tr.com.obss.book;

import tr.com.obss.author.Author;
import tr.com.obss.genre.Genre;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "Book_id")
    private Integer id;
    @Column(name = "Book_isbn")
    private String isbn;
    @Column(name = "Book_name")
    private String name;
    @Column(name = "Book_imageLink")
    private String imageLink;
    @ManyToOne
    @JoinColumn(name = "Book_authorId")
    private Author author;
    @ManyToOne
    @JoinColumn(name = "Book_genreId")
    private Genre genre;

    public Book() {
        this.id = 0;
        this.isbn = "";
        this.name = "";
        this.imageLink = "";
        this.author = new Author();
        this.genre = new Genre();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
