package com.deuslley.movie.controllers;

import com.deuslley.movie.DTO.MovieDTO;

import com.deuslley.movie.DTO.ScoreDTO;
import com.deuslley.movie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){

        MovieDTO dtoM = service.saveScore(dto);
        return dtoM;
    }
}