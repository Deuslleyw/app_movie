package com.deuslley.movie.entities;
import lombok.*;

import javax.persistence.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    private  Long id;

    @Column(name = "email")
    private String email;

    }
