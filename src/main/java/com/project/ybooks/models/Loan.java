package com.project.ybooks.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;

    @ManyToMany
    @JoinTable(name = "books_loans",
            joinColumns = @JoinColumn(name = "loan_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> books;

    @ManyToOne
    @JoinColumn(name = "borrowed_user_id", nullable = false)
    private User borrowedUser; // Renomeado para corresponder ao mapeamento na entidade User

    @ManyToOne
    @JoinColumn(name = "user_lending_id", nullable = false)
    private User lendingUser; // Renomeado para corresponder ao mapeamento na entidade User

    public Loan() {

    }

    public Loan(Long id, LocalDateTime loanDate, LocalDateTime returnDate, List<Book> books, User borrowedUser, User lendingUser) {
        this.id = id;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.books = books;
        this.borrowedUser = borrowedUser;
        this.lendingUser = lendingUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public User getBorrowedUser() {
        return borrowedUser;
    }

    public void setBorrowedUser(User borrowedUser) {
        this.borrowedUser = borrowedUser;
    }

    public User getLendingUser() {
        return lendingUser;
    }

    public void setLendingUser(User lendingUser) {
        this.lendingUser = lendingUser;
    }
}