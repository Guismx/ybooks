package com.project.ybooks.services;

import com.project.ybooks.models.Book;
import com.project.ybooks.models.User;
import com.project.ybooks.repositories.BookRepository;
import com.project.ybooks.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    private UserRepository userRepository;

    public String createBook(Book book) {
        if (book.getCreatedBy() == null || book.getCreatedBy().getId() == null) {
            throw new IllegalArgumentException("User is required to create a book");
        }

        // Busca o usuário no banco para garantir que ele existe
        User user = userRepository.findById(book.getCreatedBy().getId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        book.setCreatedBy(user);
        bookRepository.save(book);
        return "Book created successfully";
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