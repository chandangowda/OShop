package com.oshop.oshopproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oshop.oshopproduct.dto.ProductDto;
import com.oshop.oshopproduct.dto.ProductResponseDto;
import com.oshop.oshopproduct.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@PostMapping("saveproduct")
	public void saveProduct(@RequestBody ProductDto productDto) {
		productService.saveProduct(productDto);
	}
	
	@PostMapping("getallproduct")
	public ProductResponseDto getProduct() {
		return productService.getProduct();
	}
	
	@GetMapping("getproduct/{id}")
	public ProductResponseDto getProductById(@PathVariable String id) {
		return productService.getProductById(id);
	}
	
	@PostMapping("updateProduct")
	public ProductResponseDto updateProduct(@RequestBody ProductDto productDto) {
		return  productService.upddateProduct(productDto);
	}
	
	@RequestMapping(value="/deleteproduct",method=RequestMethod.DELETE)
	public ProductResponseDto deleteProduct(@RequestParam("productid") String productid) {
		return  productService.deleteProduct(productid);
	}
 
	
	

}
