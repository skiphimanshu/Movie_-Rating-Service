package com.user.service.services;

import java.util.List;

import com.user.service.entity.Rating;

public interface RatingService {
	
	//create Rating
	Rating createRating(Rating raating);
	
	// Get All Rating
	
	List<Rating> getAllRating();
	
	// Get Rating By Id
	
	Rating getRatingById(String id);
	
	// Get Rating By userId
	
	List<Rating> getRatingByUserId(String uId);
	
	//Get List of rating by Movie Id
	
	List<Rating> getAllRatingByMovieId(String mId);
	
	

}
