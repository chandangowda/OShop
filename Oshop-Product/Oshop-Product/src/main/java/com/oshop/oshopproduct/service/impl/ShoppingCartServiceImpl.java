package com.oshop.oshopproduct.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oshop.oshopproduct.dto.ShoppingCartDto;
import com.oshop.oshopproduct.dto.ShoppingCartResponseDto;
import com.oshop.oshopproduct.entity.ShoppingCart;
import com.oshop.oshopproduct.service.ShoppingCartRepository;
import com.oshop.oshopproduct.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	
	@Autowired
	Mapper mapper;
	
	@Autowired
	ShoppingCartRepository repository;

	@Override
	public ShoppingCartResponseDto saveCartItem(ShoppingCartDto request) {
		ShoppingCart cart=mapper.map(request, ShoppingCart.class);
		ShoppingCartResponseDto response=new ShoppingCartResponseDto();
		try {
			repository.save(cart);
			response.setStatus(true);
			response.setStatusCode(201);
			response.setStatusMessage("Cart item saved successfully");
			List<ShoppingCartDto> savedData=new ArrayList<>();
			ShoppingCartDto savedEntity=mapper.map(cart, ShoppingCartDto.class);
			savedData.add(savedEntity);
			response.setCartData(savedData);
		}catch(Exception e) {
			response.setStatusMessage("Error in saving cart item");
		}
			return response;
		
	}

	@Override
	public ShoppingCartResponseDto getCartItem(String cartid) {
		ShoppingCartResponseDto response=new ShoppingCartResponseDto();
		ObjectId cartId=new ObjectId(cartid);
		Optional<ShoppingCart> dbresponse=repository.findById(cartId);
		List<ShoppingCartDto> savedData=new ArrayList<>();
		ShoppingCartDto savedEntity=mapper.map(savedData, ShoppingCartDto.class);
		savedData.add(savedEntity);
		response.setCartData(savedData);
		return response;
	}

}
