package com.user.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {
	
	@Id
	private String id;
	private String feedBack;
	private int rate;
	private String movieId;
	private String userId;

}
