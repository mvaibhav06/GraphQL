package com.project.graphql.services;

import com.project.graphql.entities.Book;

import java.util.List;

public interface BookService {

    Book createBook(Book book);
    List<Book> findAll();
    Book findById(int id);
}
