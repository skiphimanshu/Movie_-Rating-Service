package com.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String s) {

		super(s);
	}

	public ResourceNotFoundException() {

		super("User Not Found !");
	}

}
