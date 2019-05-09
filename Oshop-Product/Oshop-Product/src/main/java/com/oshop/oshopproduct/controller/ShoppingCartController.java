package com.oshop.oshopproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

}
