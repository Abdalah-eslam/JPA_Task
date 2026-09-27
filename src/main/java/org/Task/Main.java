package org.Task;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.Task.Models.Author;
import org.Task.Models.Book;
import org.Task.Models.Category;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Task"); ) {


   // Author author = new Author( "John Doe", "JohnDoe@gmail.com", "USA");
//        Book book = new Book( "Book 1", 1000,120, author);
//        Book book1 = new Book("Clean Code",1000,464,author);
//
//        Book book2 = new Book("Effective Java",1200,416, author);
//
//        Category category = new Category("Category 1" ,"CategoryImage.jpg" );
//        book.Addcategory(category);
//        book1.Addcategory(category);
//        book2.Addcategory(category);
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.persist(category);
//        em.persist(book);
//        em.persist(author);
//        em.getTransaction().commit();
//       em.close();




}



    try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Task"); ) {
      EntityManager em=  emf.createEntityManager();

      em.getTransaction().begin();

      //Using Fetch Join
//    Book book  =  em.find(Book.class,1);
//        System.out.println(book);
//        System.out.println(book.getCategories());
//        System.out.println(book.getAuthor());


        //Fetching books Using JPQL
//        String jpql = """
//    SELECT b
//    FROM Book b
//    WHERE b.author.name = :authorName
//    """;
//
//        List<Book> books = em
//                .createQuery(jpql, Book.class)
//                .setParameter("authorName", "John Doe")
//                .getResultList();
//        System.out.println(books.toString());


        //Fetching books Using JPQL Positional Parameters
//        String jpql = """
//    SELECT b
//    FROM Book b
//    WHERE b.id = ?1
//    """;
//
//        Book book = em
//                .createQuery(jpql, Book.class)
//                .setParameter(1, 2L)
//                .getSingleResult();
//        System.out.println(book);
//        System.out.println(book.getAuthor());


        //Fetching author Using JPQL Fetch Join
//        String jpql = """
//    SELECT DISTINCT a
//    FROM Author a
//    JOIN FETCH a.books
//    WHERE a.id = :id
//    """;
//
//        Author author = em
//                .createQuery(jpql, Author.class)
//                .setParameter("id", 1L)
//                .getSingleResult();
//        System.out.println(author);



        //Fetching books Using Criteria API
//        CriteriaBuilder cb =
//                em.getCriteriaBuilder();
//
//        CriteriaQuery<Book> query =
//                cb.createQuery(Book.class);
//
//        Root<Book> book =
//                query.from(Book.class);
//
//        query.select(book)
//                .where(
//                        cb.equal(book.get("title"), "Clean Code")
//                );
//
//        List<Book> books =
//                em
//                        .createQuery(query)
//                        .getResultList();
//        System.out.println(books.toString());

        //Fetching books Using Criteria API dynamic
//            CriteriaBuilder cb =
//                    em.getCriteriaBuilder();
//
//            CriteriaQuery<Book> query =
//                    cb.createQuery(Book.class);
//
//            Root<Book> book =
//                    query.from(Book.class);
//
//            List<Predicate> predicates =
//                    new ArrayList<>();


      em.getTransaction().commit();
      em.close();
    }




    }
}