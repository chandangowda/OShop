package com.oshop.oshopproduct.service;

import com.oshop.oshopproduct.dto.ShoppingCartDto;
import com.oshop.oshopproduct.dto.ShoppingCartResponseDto;

public interface ShoppingCartService {

	ShoppingCartResponseDto saveCartItem(ShoppingCartDto request);

	ShoppingCartResponseDto getCartItem(String cartid);

	ShoppingCartResponseDto findAndUpdateProductIdAndCartid(String cartid, String prodid);

	ShoppingCartResponseDto deleteProductById(String cartid, String prodid);

	ShoppingCartResponseDto clearProductById(String cartid);

}
