package com.deuslley.movie.entities;
import lombok.*;

import javax.persistence.*;

@ToString
@Setter
@Getter
@Builder
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