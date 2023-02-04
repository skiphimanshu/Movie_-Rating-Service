package com.movie.service.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	
	@Id
	private String id;
	private String name;
	private String releaseDate;
	private String languages;
	private String description;
	
	@Transient
	private List<Rating> rating = new ArrayList<>();
	

}
