package com.project.graphql;

import com.project.graphql.entities.Book;
import com.project.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlProjectApplication implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(GraphQlProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book b1 = new Book();
        b1.setTitle("Complete Reference");
        b1.setDesc("For learning Java");
        b1.setPages(200);
        b1.setPrice(5000);
        b1.setAuthor("XYZ");

        Book b2 = new Book();
        b2.setTitle("Think Java");
        b2.setDesc("For learning Python");
        b2.setPages(100);
        b2.setPrice(2500);
        b2.setAuthor("ABC");

        Book b3 = new Book();
        b3.setTitle("Zero to Hero");
        b3.setDesc("For learning C++ concepts");
        b3.setPages(130);
        b3.setPrice(4600);
        b3.setAuthor("PSZ");

        bookService.createBook(b1);
        bookService.createBook(b2);
        bookService.createBook(b3);
    }
}
