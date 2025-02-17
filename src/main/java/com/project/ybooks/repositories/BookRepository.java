package com.project.ybooks.repositories;

import com.project.ybooks.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}
