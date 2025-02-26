package com.project.ybooks.models;


import com.project.ybooks.enums.UserEnum;
import jakarta.persistence.*;
import lombok.*;

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

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    UserEnum userEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
