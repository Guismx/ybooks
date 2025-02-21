package com.project.ybooks.services;

import com.project.ybooks.models.Book;
import com.project.ybooks.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String createBook(Book book) {
        bookRepository.save(book);
        return "book created sucessfully";
    }

    public String updateBook(Book book, Long id) {
        book.setId(id);
        bookRepository.save(book);
        return "book updated successfully";
    }

    public String deleteBook(long id) {
        bookRepository.deleteById(id);
        return "book deleted with successfully";
    }

    public List<Book> allBooks() {
        return this.bookRepository.findAll();
    }

    public Book bookById(Long id) {
        return this.bookRepository.findById(id).orElse(null);
    }

    public List<Book> findByCategory (String category) {
       return bookRepository.findByCategory(category);
    }
}
