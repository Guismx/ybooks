package com.project.ybooks.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "books_loans",
            joinColumns = @JoinColumn(name = "loan_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> books;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "borrowed_user_id", nullable = false)
    private User borrowedUser; // Renomeado para corresponder ao mapeamento na entidade User

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_lending_id", nullable = false)
    private User lendingUser; // Renomeado para corresponder ao mapeamento na entidade User




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}