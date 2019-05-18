package com.oshop.oshopproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oshop.oshopproduct.dto.ShoppingCartDto;
import com.oshop.oshopproduct.dto.ShoppingCartResponseDto;
import com.oshop.oshopproduct.service.ShoppingCartService;

@RestController
@RequestMapping("shoppingcart")
public class ShoppingCartController {
	
	@Autowired
	ShoppingCartService cartService;
	
	
	@PostMapping("/savecart")
	public ShoppingCartResponseDto saveCartItem(@RequestBody ShoppingCartDto request) {
		return cartService.saveCartItem(request);
	}
	
	@GetMapping("/getcart/{id}")
	public ShoppingCartResponseDto getCartItem(@PathVariable String id) {
		return cartService.getCartItem(id);
	}
	
	@PostMapping("/findbycartproid/{cartid}/{prodid}")
	public ShoppingCartResponseDto findAndUpdateProductIdAndCartid(@PathVariable("cartid") String cartid,@PathVariable("prodid") String prodid) {
		return cartService.findAndUpdateProductIdAndCartid(cartid,prodid);
	}
	

	@DeleteMapping("/deleteProductById/{cartid}/{prodid}")
	public ShoppingCartResponseDto deleteProductById(@PathVariable("cartid") String cartid,@PathVariable("prodid") String prodid) {
		return cartService.deleteProductById(cartid,prodid);
	}
	
	

}
