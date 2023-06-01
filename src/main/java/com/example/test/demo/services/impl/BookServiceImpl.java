package com.example.test.demo.services.impl;

import com.example.test.demo.entities.Book;
import com.example.test.demo.repositories.BookRepo;
import com.example.test.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepo bookRepo;

    @Override
    public Book create(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Optional<Book> getBookById(int bookId) {
        return bookRepo.findById(bookId);
    }
}
