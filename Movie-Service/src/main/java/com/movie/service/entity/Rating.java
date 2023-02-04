package com.movie.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {
	
	private String feedBack;
	private int rate;
	private String userId;
	
	private String userName;

}
