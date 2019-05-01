package com.oshop.oshopproduct.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oshop.oshopproduct.dto.ProductDto;
import com.oshop.oshopproduct.dto.ProductResponseDto;
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

	@Override
	public ProductResponseDto getProduct() {
		ProductResponseDto response=new ProductResponseDto();
		List<Product> allProduct=productRepo.findAll();
		List<ProductDto> allProductDto=allProduct.stream().map(element->mapper.map(element, ProductDto.class)).collect(Collectors.toList());
		response.setStatus(true);
		response.setProductResponseList(allProductDto);
		return response;
	}

	@Override
	public ProductResponseDto getProductById(String id) {
		ProductResponseDto response=new ProductResponseDto();
		ObjectId productId=new ObjectId(id);
		Optional<Product> productIdData=productRepo.findById(productId);
		response.setStatus(true);
		Product storedProduct=productIdData.get();
		List<ProductDto> productDtoList=new ArrayList<>();
		productDtoList.add(mapper.map(storedProduct, ProductDto.class));
		response.setProductResponseList(productDtoList);
		return response;
	}

	@Override
	public ProductResponseDto upddateProduct(ProductDto productDto) {
		ProductResponseDto response=new ProductResponseDto();
		ObjectId productId=new ObjectId(productDto.getId());
		Product product=mapper.map(productDto, Product.class);
		product.setId(productId);
		productRepo.save(product);
		response.setStatus(true);
		response.setStatusCode(200);
		return response;
	}

	@Override
	public ProductResponseDto deleteProduct(String productid) {
		ProductResponseDto response=new ProductResponseDto();
		ObjectId productId=new ObjectId(productid);
		productRepo.deleteById(productId);
		response.setStatus(true);
		response.setStatusCode(200);
		return response;
	}
	
}
