package com.movie.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.service.entity.Movie;
import com.movie.service.services.MovieService;

@RestController
@RequestMapping("/movie")
@CrossOrigin("http://localhost:4200/")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/create-movie")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
		
		Movie createMovie = this.movieService.createMovie(movie);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createMovie);	
	}
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> getAllMovies() {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.movieService.getAllMovie());
		
	}
	
	@GetMapping("/movie/{id}")
	public ResponseEntity<Movie> getMovieById(@PathVariable("id") String id) {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.movieService.getMovieById(id));
		
	}

}
