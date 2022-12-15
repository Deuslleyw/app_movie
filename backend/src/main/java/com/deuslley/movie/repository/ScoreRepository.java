package com.deuslley.movie.repository;

import com.deuslley.movie.entities.Score;
import com.deuslley.movie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
