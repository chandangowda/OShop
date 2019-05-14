package com.oshop.oshopproduct.service;

import java.util.List;

import com.oshop.oshopproduct.dto.ProductDto;
import com.oshop.oshopproduct.dto.ProductResponseDto;

public interface ProductService {
	
	void saveProduct(ProductDto productDto);

	ProductResponseDto getProduct();

	ProductResponseDto getProductById(String id);

	ProductResponseDto upddateProduct(ProductDto productDto);

	ProductResponseDto deleteProduct(String productid);

	ProductResponseDto getProductsById(List<String> id);

}
