package com.project.ybooks.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table (name = "Loan")
public class Loan {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private int bookId;
    private int userId;
    private Date loanDate;
    private Date returnDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getLoanData() {
        return loanDate;
    }

    public void setLoanData(Date loanData) {
        this.loanDate = loanData;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
