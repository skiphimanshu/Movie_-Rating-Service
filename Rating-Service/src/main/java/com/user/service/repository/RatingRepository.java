package com.user.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.service.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String>{

	// find rating by userId
	List<Rating> findByuserId(String userId);
	
	
	//find rating by movieId
	
	List<Rating> findBymovieId(String movieId);
}
