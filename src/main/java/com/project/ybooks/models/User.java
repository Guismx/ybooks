package com.project.ybooks.models;

import com.project.ybooks.enums.UserEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table (name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Date data_nascimento;
    private String cpf;
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    UserEnum userEnum;

    @OneToMany(mappedBy = "createdBy")
    @JoinColumn(name="book_id", nullable = false)
    private List<Book> books;

    // TODO: QUEM ESTA EMPRESTANDO
    @OneToMany(mappedBy = "borroweduser_user")
    private List<Loan> borrowdloans;

    // TODO: USUARIO QUE ESTA PEGANDO EMPRESTADO
    @OneToMany(mappedBy = "user_lending")
    private List<Loan> userlending;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
