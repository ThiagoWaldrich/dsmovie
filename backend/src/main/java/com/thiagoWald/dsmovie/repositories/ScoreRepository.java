package com.thiagoWald.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoWald.dsmovie.entities.Score;
import com.thiagoWald.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}

