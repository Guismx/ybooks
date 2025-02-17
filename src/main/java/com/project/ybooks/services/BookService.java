package com.project.ybooks.services;

import com.project.ybooks.models.Book;
import com.project.ybooks.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String createBook(Book book) {
        bookRepository.save(book);
        return "book created with sucessfull";
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
