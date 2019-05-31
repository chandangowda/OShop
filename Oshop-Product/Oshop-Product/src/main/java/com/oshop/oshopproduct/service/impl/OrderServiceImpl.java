package com.oshop.oshopproduct.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oshop.oshopproduct.dto.OrderDto;
import com.oshop.oshopproduct.dto.OrderResponseDto;
import com.oshop.oshopproduct.entity.Order;
import com.oshop.oshopproduct.repository.OrderRepository;
import com.oshop.oshopproduct.service.OrderService;

@Service
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

	@Override
	public OrderResponseDto getOrderbUserid(String userid) {
		OrderResponseDto response=new OrderResponseDto();
		List<Order> orderList=orderRepository.findByuserId(userid);
		List<OrderDto> orderListResponse=orderList.stream().map(element->mapper.map(element, OrderDto.class)).collect(Collectors.toList());
		response.setStatus(true);
		response.setStatusCode(200);
		response.setStatusMessage("Order List");
		response.setOrderData(orderListResponse);
		return response;
	}

	@Override
	public OrderResponseDto getOrders() {
		OrderResponseDto response=new OrderResponseDto();
		List<Order> orderList=orderRepository.findAll();
		List<OrderDto> orderListResponse=orderList.stream().map(element->mapper.map(element, OrderDto.class)).collect(Collectors.toList());
		response.setStatus(true);
		response.setStatusCode(200);
		response.setStatusMessage("Order List");
		response.setOrderData(orderListResponse);
		return response;
	}

}
