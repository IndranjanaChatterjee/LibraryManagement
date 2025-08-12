package com.library.librarymanagement;

import com.library.librarymanagement.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(LibraryManagementApplication.class, args);
        BookService service = ctx.getBean(BookService.class);
        service.saveBooks("Clean Code");
        System.out.println("Books: " + service.getAllBooks());
	}

}
