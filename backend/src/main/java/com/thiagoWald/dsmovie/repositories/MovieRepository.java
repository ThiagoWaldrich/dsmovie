package com.thiagoWald.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoWald.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
