package com.oshop.oshopproduct.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.oshop.oshopproduct.dto.ProductExceptionDto;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	private ResponseEntity<ProductExceptionDto> handleApplicationException(Exception e) {
		ProductExceptionDto resposne=new ProductExceptionDto();
		 resposne.setErrorDetailMessage("Error");
		 resposne.setStatusCode(500);
		 return new ResponseEntity<ProductExceptionDto>(resposne, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
