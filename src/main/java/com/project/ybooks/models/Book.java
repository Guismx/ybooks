package com.project.ybooks.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Books")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String author;
    private int year;
    private int publisher;
    private String category;
    private int quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    private User createdBy;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
