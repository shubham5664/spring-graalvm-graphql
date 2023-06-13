package com.example.test.demo;

import com.example.test.demo.entities.Book;
import com.example.test.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;

@SpringBootApplication(exclude = SpringDataWebAutoConfiguration.class,proxyBeanMethods = false)
public class DemoApplication implements CommandLineRunner {

	@Autowired
	BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) {
		Book b1 = new Book();
		b1.setTitle("test1");
		b1.setDescription("desc1");
		b1.setPrice(100);
		b1.setAuthor("auth1");
		b1.setPages(125);

		Book b2 = new Book();
		b2.setTitle("test11");
		b2.setDescription("desc11");
		b2.setPrice(10);
		b2.setAuthor("auth11");
		b2.setPages(12);

		bookService.create(b1);
		bookService.create(b2);
	}

}
