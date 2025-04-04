package com.project.ybooks.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.ybooks.enums.UserEnum;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Date birth_date;
    private String cpf;
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserEnum userEnum;

    @OneToMany(mappedBy = "borrowedUser", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Loan> borrowedLoans; // Associado corretamente ao borrowedUser na entidade Loan

    @OneToMany(mappedBy = "lendingUser", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Loan> userLending; // Associado corretamente ao lendingUser na entidade Loan

    public User() {
    }

    public User(Long id, String nome, Date birth_date, String cpf, String username, String password, UserEnum userEnum, List<Loan> borrowedLoans, List<Loan> userLending) {
        this.id = id;
        this.nome = nome;
        this.birth_date = birth_date;
        this.cpf = cpf;
        this.username = username;
        this.password = password;
        this.userEnum = userEnum;
        this.borrowedLoans = borrowedLoans;
        this.userLending = userLending;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_nascimento() {
        return birth_date;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.birth_date = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserEnum getUserEnum() {
        return userEnum;
    }

    public void setUserEnum(UserEnum userEnum) {
        this.userEnum = userEnum;
    }

    public List<Loan> getBorrowedLoans() {
        return borrowedLoans;
    }

    public void setBorrowedLoans(List<Loan> borrowedLoans) {
        this.borrowedLoans = borrowedLoans;
    }

    public List<Loan> getUserLending() {
        return userLending;
    }

    public void setUserLending(List<Loan> userLending) {
        this.userLending = userLending;
    }
}
