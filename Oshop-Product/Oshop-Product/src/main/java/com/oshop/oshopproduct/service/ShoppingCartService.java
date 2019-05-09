package com.oshop.oshopproduct.service;

import com.oshop.oshopproduct.dto.ShoppingCartDto;
import com.oshop.oshopproduct.dto.ShoppingCartResponseDto;

public interface ShoppingCartService {

	ShoppingCartResponseDto saveCartItem(ShoppingCartDto request);

}
