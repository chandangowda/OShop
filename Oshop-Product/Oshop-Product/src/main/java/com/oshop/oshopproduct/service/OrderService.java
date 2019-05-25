package com.oshop.oshopproduct.service;

import com.oshop.oshopproduct.dto.OrderDto;
import com.oshop.oshopproduct.dto.OrderResponseDto;

public interface OrderService {

	OrderResponseDto saveOrder(OrderDto order);

	OrderResponseDto getOrderbUserid(String userid);

	OrderResponseDto getOrders();

}
