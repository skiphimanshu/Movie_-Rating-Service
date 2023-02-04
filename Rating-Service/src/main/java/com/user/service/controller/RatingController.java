package com.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.entity.Rating;
import com.user.service.services.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingservice;
	
	@PostMapping("/create-rating")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		
		Rating createRating = this.ratingservice.createRating(rating);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createRating);
	}
	
	@GetMapping("/ratings")
	public ResponseEntity<List<Rating>> getAllRating() {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingservice.getAllRating());
		
	}
	@GetMapping("/rating/{id}")
	public ResponseEntity<Rating> getRatingById(@PathVariable("id") String id) {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingservice.getRatingById(id));
		
	}
	@GetMapping("/user-rating/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingByUserId(@PathVariable("userId") String uid) {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingservice.getRatingByUserId(uid));
		
	}
	
	@GetMapping("/movie-rating/{moviedId}") 
	public ResponseEntity<List<Rating>> getAllRatingByMovieId(@PathVariable("moviedId") String mId) {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.ratingservice.getAllRatingByMovieId(mId));
	}


}
