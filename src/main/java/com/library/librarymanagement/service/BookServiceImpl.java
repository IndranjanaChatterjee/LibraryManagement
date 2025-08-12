package com.library.librarymanagement.service;

import com.library.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{


    @Autowired
    public BookRepository bookRepository;





    @Override
    public List<String> getAllBooks()
    {
        return bookRepository.findAll();
    }

    @Override
    public void saveBooks(String str) {
        bookRepository.save(str);
    }
}
