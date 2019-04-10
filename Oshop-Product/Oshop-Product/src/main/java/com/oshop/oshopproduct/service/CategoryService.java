package com.oshop.oshopproduct.service;

import com.oshop.oshopproduct.dto.CategoryResponseDto;

public interface CategoryService {
	
	CategoryResponseDto getAllCategory();

	CategoryResponseDto getByCategory(String catid);

}
