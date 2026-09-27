package org.Task.Models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String image;
    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();

    public Category( String name, String image) {

        this.name = name;
        this.image = image;
    }
    public Category() {
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", image=" + image + "]";
    }
    void addBook(Book book){
        books.add(book);
        book.getCategories().add(this);
    }

    void removeBook(Book book) {
        books.remove(book);
        book.getCategories().remove(this);
    }
}
