package com.deuslley.movie.controllers;

import com.deuslley.movie.DTO.MovieDTO;

import com.deuslley.movie.DTO.ScoreDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
    return null;
    }
}