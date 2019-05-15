package com.oshop.oshopproduct.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.oshop.oshopproduct.dto.ShoppingCartDto;
import com.oshop.oshopproduct.dto.ShoppingCartResponseDto;
import com.oshop.oshopproduct.entity.Item;
import com.oshop.oshopproduct.entity.ShoppingCart;
import com.oshop.oshopproduct.repository.ShoppingCartRepository;
import com.oshop.oshopproduct.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	
	@Autowired
	Mapper mapper;
	
	@Autowired
	ShoppingCartRepository repository;
	
	@Autowired
	MongoOperations operation;

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
		ShoppingCartDto savedEntity=mapper.map(dbresponse.get(), ShoppingCartDto.class);
		savedData.add(savedEntity);
		response.setCartData(savedData);
		return response;
	}

	@Override
	public ShoppingCartResponseDto findAndUpdateProductIdAndCartid(String cartid, String prodid) {
		ShoppingCart cart=repository.findByCartidAndProductId(cartid,prodid);
		ShoppingCartResponseDto response=new ShoppingCartResponseDto();
		
		if(cart==null) {
			Update update = new Update();
			Item item=new Item();
			item.setProductId(prodid);
			item.setCartCount(1);
			update.addToSet("items", item);
			Criteria sCriteria = new Criteria();
			sCriteria.andOperator(Criteria.where("_id").is(new ObjectId(cartid)));
			Query q = new Query().addCriteria(sCriteria);
			operation.updateFirst(q, update, ShoppingCart.class);
			ObjectId cartId=new ObjectId(cartid);
			Optional<ShoppingCart> dbresponse=repository.findById(cartId);
			List<ShoppingCartDto> savedData=new ArrayList<>();
			ShoppingCartDto savedEntity=mapper.map(dbresponse.get(), ShoppingCartDto.class);
			savedData.add(savedEntity);
			response.setCartData(savedData);
			response.setStatusCode(200);
			response.setStatus(true);
		}else {
			cart.getItems().forEach(element->{
				if(element.getProductId().equals(prodid)) {
					element.setCartCount(element.getCartCount()+1);
				}
			});
			repository.save(cart);
			List<ShoppingCartDto> savedData=new ArrayList<>();
			ShoppingCartDto savedEntity=mapper.map(cart, ShoppingCartDto.class);
			savedData.add(savedEntity);
			response.setCartData(savedData);
			response.setStatusCode(200);
			response.setStatus(true);
		}
		return response;
	}

}
