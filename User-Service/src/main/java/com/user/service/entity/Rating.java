package com.user.service.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	private String feedBack;
	private int rate;
	private String movieId;
	
	private Movie movie;

}
