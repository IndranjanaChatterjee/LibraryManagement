package com.library.librarymanagement.controller;

import com.library.librarymanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import org.apache.juli.logging.Log;
import org.slf4j.LoggerFactory;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    private final Logger logger=LoggerFactory.getLogger(BookController.class);

    @GetMapping("/Books")
    public List<String> getBooks()
    {
        logger.info("inside /books route");
       return  bookService.getAllBooks();
    }



}
