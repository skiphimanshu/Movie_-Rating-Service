package com.user.service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.entity.Rating;
import com.user.service.exception.ResourceNotFoundException;
import com.user.service.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating createRating(Rating raating) {
		String randomId = UUID.randomUUID().toString();
		raating.setId(randomId);
		
		return this.ratingRepository.save(raating);
	}

	@Override
	public List<Rating> getAllRating() {
		
		return this.ratingRepository.findAll();
	}

	@Override
	public Rating getRatingById(String id) {

		return this.ratingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource Not Found"));
	}

	@Override
	public List<Rating> getRatingByUserId(String uId) {
		
		return this.ratingRepository.findByuserId(uId);
	}

	@Override
	public List<Rating> getAllRatingByMovieId(String mId) {
		
		return this.ratingRepository.findBymovieId(mId);
	}
	
	

	

}
