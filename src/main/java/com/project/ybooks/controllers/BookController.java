package com.project.ybooks.controllers;


import com.project.ybooks.models.Book;
import com.project.ybooks.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ybook/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public ResponseEntity<String> createBook(@RequestBody Book book) {
        try {
            String responseMessage = bookService.createBook(book);
            return new ResponseEntity<>(responseMessage, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error creating book", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateBook(@RequestBody Book book,@PathVariable Long id) {
        try {
            String responseMessage = bookService.updateBook(book, id);
            return new ResponseEntity<>(responseMessage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error update book", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        try {
            String responseMessage = bookService.deleteBook(id);
            return new ResponseEntity<>(responseMessage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error when delete book", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Book>> allBooks() {
        try {
            List<Book> lista = bookService.allBooks();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/findbook/{id}")
    public ResponseEntity<Book> bookById(@PathVariable Long id) {
        try {
            Book book = bookService.bookById(id);
            if (book == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(book, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/findbycategory/{category}")
    public ResponseEntity<List<Book>> findByCategory (@PathVariable String category) {
        try {
            List<Book> list = bookService.findByCategory(category);
            if (list.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(list);
        } catch (Exception e ) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}