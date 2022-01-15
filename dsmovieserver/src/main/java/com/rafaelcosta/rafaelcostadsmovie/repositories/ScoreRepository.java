package com.rafaelcosta.rafaelcostadsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcosta.rafaelcostadsmovie.entities.Score;
import com.rafaelcosta.rafaelcostadsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
