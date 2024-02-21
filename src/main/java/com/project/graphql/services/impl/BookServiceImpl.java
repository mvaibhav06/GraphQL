package com.project.graphql.services.impl;

import com.project.graphql.entities.Book;
import com.project.graphql.repo.BookRepo;
import com.project.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book with given id not found on server"));
    }
}
