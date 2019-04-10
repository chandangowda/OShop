package com.oshop.oshopproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oshop.oshopproduct.dto.CategoryResponseDto;
import com.oshop.oshopproduct.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	
	
	@GetMapping("/getall")
	public CategoryResponseDto getAllCategory() {
		return service.getAllCategory();
	}
	
	@GetMapping("/getbycatgory/{catid}")
	public CategoryResponseDto getByCategory(@PathVariable String catid) {
		return service.getByCategory(catid);
	} 

}
