package com.example.test.demo;

import com.example.test.demo.dto.BookInput;
import com.example.test.demo.entities.Book;
import com.example.test.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@Controller
//@RestController
//@RequestMapping("/book")
public class BookResource {

    @Autowired
    BookService bookService;

    @MutationMapping("createBook")
    //@PostMapping
    public void createBook(@Argument BookInput book)
    {
        Book book1=new Book();
        book1.setTitle(book.getTitle());
        book1.setDescription(book.getDesc());
        book1.setPrice(book.getPrice());
        book1.setAuthor(book.getAuthor());
        book1.setPages(book.getPages());
        bookService.create(book1);
    }
    //@GetMapping
    @QueryMapping("getAllBooks")
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }


    @QueryMapping("getBook")
    //@GetMapping("/{bookId}")
    public Optional<Book> getBook(@Argument int bookId)
    {
        return bookService.getBookById(bookId);
    }
}
