package com.oshop.oshopproduct.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oshop.oshopproduct.dto.CategoryDto;
import com.oshop.oshopproduct.dto.CategoryResponseDto;
import com.oshop.oshopproduct.entity.Category;
import com.oshop.oshopproduct.repository.CategoryRepository;
import com.oshop.oshopproduct.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	Mapper mapper;

	@Override
	public CategoryResponseDto getAllCategory() {
		CategoryResponseDto response=new CategoryResponseDto();
		List<Category> categoryList=categoryRepository.findAll();
		List<CategoryDto> categoryDtoList=categoryList.stream().map(entity->mapper.map(entity, CategoryDto.class)).collect(Collectors.toList());
		response.setCategoryres(categoryDtoList);
		return response;
	}

	@Override
	public CategoryResponseDto getByCategory(String catid) {
		CategoryResponseDto response=new CategoryResponseDto();
		List<CategoryDto> categoryDtoList=new ArrayList<>();
		Optional<Category> catgory=categoryRepository.findById(catid);
		if(catgory.isPresent()) {
			CategoryDto dtoResponse=mapper.map(catgory.get(), CategoryDto.class);
			categoryDtoList.add(dtoResponse);
		}
		response.setCategoryres(categoryDtoList);
		return response;
	}

}
