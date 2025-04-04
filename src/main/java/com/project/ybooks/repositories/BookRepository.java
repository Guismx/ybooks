package com.project.ybooks.repositories;

import com.project.ybooks.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository <Book, Long> {
    List<Book> findByCategory(String category);
}