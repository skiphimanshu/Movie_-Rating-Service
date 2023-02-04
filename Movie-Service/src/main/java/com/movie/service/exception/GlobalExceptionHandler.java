package com.movie.service.exception;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String,Object>> movieNotFoundHandler(ResourceNotFoundException exception) {
		
		Map map = new LinkedHashMap<>();
		
		map.put("Message", exception.getMessage());
		map.put("Suceess",false);
		map.put("Status",HttpStatus.NOT_FOUND);

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		
		
	}

}
