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
@Table (name = "Loan")
public class Loan {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="books_loans")
    private List<Book> book;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "borroweduser_id", nullable = false)
    private User borrowed_user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userlending_id", nullable = false)
    private User user_lending;

    private LocalDateTime loanDate;
    private LocalDateTime returnDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
