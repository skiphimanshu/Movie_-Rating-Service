package com.movie.service.services;

import java.util.List;

import com.movie.service.entity.Movie;

public interface MovieService {
	
	// create Movie
	
	Movie createMovie(Movie movie);
	
	// GetAll Movie
	
	List<Movie> getAllMovie();
	
	//Get Single Movie By Id
	
	Movie getMovieById(String id);
	
}