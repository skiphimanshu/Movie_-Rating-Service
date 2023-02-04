package com.movie.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String s) {

		super(s);
	}

	public ResourceNotFoundException() {

		super("Movie Not Found !");
	}

}
