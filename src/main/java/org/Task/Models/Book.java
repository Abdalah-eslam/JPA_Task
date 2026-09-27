package org.Task.Models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String title;
    public double price;
    public int PageNo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    public Author author;
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    public Publisher publisher;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();

    public void Addcategory(Category category){
        categories.add(category);
        category.addBook(this);
    }
    public void Removecategory(Category category){
        categories.remove(category);
        category.removeBook(this);
    }



    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }




    public Book( String title, double price, int pageNo, Author author) {
        this.title = title;
        this.price = price;
        PageNo = pageNo;
        this.author = author;
    }

    public Book () {

    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", price=" + price + ", pageNo=" +PageNo  + "]";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPageNo() {
        return PageNo;
    }

    public void setPageNo(int pageNo) {
        PageNo = pageNo;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;

    }
}
