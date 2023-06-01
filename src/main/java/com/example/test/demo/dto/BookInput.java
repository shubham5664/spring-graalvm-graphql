package com.example.test.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookInput {
    private String title;
    private String desc;

    private String author;
    private double price;

    private int pages;
}
