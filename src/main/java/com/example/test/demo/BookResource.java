package com.example.test.demo;

import com.example.test.demo.entities.Book;
import com.example.test.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookResource {

    @Autowired
    BookService bookService;

    @PostMapping
    public void createBook(@RequestBody Book book)
    {
        bookService.create(book);
    }
    @GetMapping
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public Optional<Book> getBook(@PathVariable int bookId)
    {
        return bookService.getBookById(bookId);
    }
}
