package com.oshop.oshopproduct.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.oshop.oshopproduct.dto.OrderDto;
import com.oshop.oshopproduct.dto.OrderResponseDto;
import com.oshop.oshopproduct.entity.Order;
import com.oshop.oshopproduct.repository.OrderRepository;
import com.oshop.oshopproduct.service.OrderService;

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	Mapper mapper;
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public OrderResponseDto saveOrder(OrderDto order) {
		OrderResponseDto response=new OrderResponseDto();
		Order saveOrder=mapper.map(order, Order.class);
		orderRepository.save(saveOrder);
		List<OrderDto> savedEntityList=new ArrayList<>();
		OrderDto savedEntity=mapper.map(saveOrder, OrderDto.class);
		response.setStatus(true);
		response.setStatusCode(200);
		response.setStatusMessage("Order save success");
		savedEntityList.add(savedEntity);
		response.setOrderData(savedEntityList);
		return response;
	}

}
