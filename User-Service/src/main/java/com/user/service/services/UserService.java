package com.user.service.services;

import java.util.List;

import com.user.service.entity.Rating;
import com.user.service.entity.User;

public interface UserService {
	
	//create user
	
	User creaateUser(User user);
	
	
	// Get All USer
	
	List<User> getAllUser();
	
	//Get Single user By Id
	
	User getUserById(String id);
	
	// Get User Name by userId
	String getUserNameById(String id);


}
