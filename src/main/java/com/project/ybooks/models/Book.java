package com.project.ybooks.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String author;
    private int year;
    private int publisher;
    private int createdBy;
}
