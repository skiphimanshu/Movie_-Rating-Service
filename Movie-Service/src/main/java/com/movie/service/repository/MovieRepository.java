package com.movie.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.service.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, String>{

}
