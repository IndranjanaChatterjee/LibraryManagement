package com.library.librarymanagement.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    public void saveBooks(String str);
    public List<String> getAllBooks();


}
