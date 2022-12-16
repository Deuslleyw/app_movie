package com.deuslley.movie.services;

import com.deuslley.movie.DTO.MovieDTO;
import com.deuslley.movie.DTO.ScoreDTO;
import com.deuslley.movie.entities.Movie;
import com.deuslley.movie.entities.Score;
import com.deuslley.movie.entities.User;
import com.deuslley.movie.repository.MovieRepository;
import com.deuslley.movie.repository.ScoreRepository;
import com.deuslley.movie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){

        User user = userRepository.findByEmail(dto.getEmail());
        if (user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        for(Score scr : movie.getScores()){
            sum = sum + scr.getValue();
        }
        double avg = sum / movie.getScores().size();
        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);

    }
}
