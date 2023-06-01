package com.example.test.demo.repositories;

import com.example.test.demo.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
