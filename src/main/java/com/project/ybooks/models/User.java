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
    @JoinColumn(name="book_id")
    private List<Book> books;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
