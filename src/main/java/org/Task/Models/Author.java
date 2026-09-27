package org.Task.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String country;
    @OneToMany(mappedBy = "author",orphanRemoval = true ,fetch = FetchType.LAZY)

    private List<Book> books =new ArrayList<>();


    public Author( String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }
    public Author() {
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", name=" + name + ", email=" + email + ", country=" + country + "]";
    }
    public void Addbook(Book book){
        books.add(book);
        book.setAuthor(this);

        }

    public void removeBook(Book book) {
        books.remove(book);
        book.setAuthor(null);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public List<Book> getBooks() {
        return books;
    }
}
