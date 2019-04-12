package com.oshop.oshopproduct.service.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oshop.oshopproduct.dto.ProductDto;
import com.oshop.oshopproduct.entity.Product;
import com.oshop.oshopproduct.repository.ProductRepository;
import com.oshop.oshopproduct.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	Mapper mapper;

	@Override
	public void saveProduct(ProductDto productDto) {
		Product  product=mapper.map(productDto, Product.class);
		productRepo.save(product);

	}
	
}
