package com.deuslley.movie.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_movie")
public class Movie {

    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column (name = "score")
    private Double score;

    @Column(name = "count")
    private Integer count;

    @Column (name = "image")
    private String image;

    }