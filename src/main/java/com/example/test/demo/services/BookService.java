package com.example.test.demo.services;

import com.example.test.demo.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book create(Book book);

    List<Book> getAllBooks();

    Optional<Book> getBookById(int bookId);

}
