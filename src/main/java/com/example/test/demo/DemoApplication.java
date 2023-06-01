package com.example.test.demo;

import com.example.test.demo.entities.Book;
import com.example.test.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book();
		b1.setTitle("test1");
		b1.setDesc("desc1");
		b1.setPrice(100);
		b1.setAuthor("auth1");
		b1.setPages(125);

		bookService.create(b1);
	}
}
