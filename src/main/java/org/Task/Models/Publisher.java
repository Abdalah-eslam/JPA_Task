package org.Task.Models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String country;
    @OneToMany(mappedBy = "publisher",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Book> books;

    void addBook(Book book){
        books.add(book);
        book.setPublisher(this);
    }
    void removeBook(Book book) {
        books.remove(book);
        book.setPublisher(null);
    }

}
