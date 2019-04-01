package com.user.userInformation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.user.userInformation.dto.UserExceptionDto;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	private ResponseEntity<UserExceptionDto> handleApplicationException(Exception e) {
		 UserExceptionDto resposne=new UserExceptionDto();
		 resposne.setErrorDetailMessage("Error");
		 resposne.setStatusCode(500);
		 return new ResponseEntity<UserExceptionDto>(resposne, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
