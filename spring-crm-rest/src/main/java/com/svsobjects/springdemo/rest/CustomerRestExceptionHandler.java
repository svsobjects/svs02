package com.svsobjects.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	public CustomerRestExceptionHandler() {
		// TODO Auto-generated constructor stub
	}
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exc){
		
		CustomerErrorResponse error_response=new CustomerErrorResponse();
		error_response.setStatus(HttpStatus.NOT_FOUND.value());
		error_response.setMessage(exc.getMessage());
		error_response.setTimestamp(System.currentTimeMillis());
		
		return (new ResponseEntity(error_response,HttpStatus.NOT_FOUND));
	}
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception exc){
		
		CustomerErrorResponse error_response=new CustomerErrorResponse();
		error_response.setStatus(HttpStatus.BAD_REQUEST.value());
		error_response.setMessage(exc.getMessage());
		error_response.setTimestamp(System.currentTimeMillis());
		
		return (new ResponseEntity(error_response,HttpStatus.BAD_REQUEST));
	}

}
