package com.library.librarymanagement.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    private final List<String> books=new ArrayList<>();

    public void save(String str)
    {
        books.add(str);
    }
    public List<String> findAll()
    {
        return new ArrayList<>(books);
    }
}
