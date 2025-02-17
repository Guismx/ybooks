package com.project.ybooks.controllers;


import com.project.ybooks.models.Book;
import com.project.ybooks.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ybook/book")
public class BookController {

    @Autowired
    BookService bookService;

    public ResponseEntity<String> createBook(@RequestBody Book book) {
        try {
            String responseMessage = bookService.createBook(book);
            return new ResponseEntity<>(responseMessage, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String updateBook() {

    }

    public String deleteBook() {

    }

    public String allBooks() {

    }

    public String bookById() {

    }

}
