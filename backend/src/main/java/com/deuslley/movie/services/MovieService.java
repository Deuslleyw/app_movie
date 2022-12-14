package com.deuslley.movie.services;

import com.deuslley.movie.DTO.MovieDTO;
import com.deuslley.movie.entities.Movie;
import com.deuslley.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(v -> new MovieDTO(v));
        return page;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie result = repository.findById(id).get();             //Falta Tratar exç / id
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }
}