package com.oshop.oshopproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oshop.oshopproduct.dto.OrderDto;
import com.oshop.oshopproduct.dto.OrderResponseDto;
import com.oshop.oshopproduct.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@PostMapping("/saveOrder")
	public OrderResponseDto saveOrder(@RequestBody OrderDto order) {
		return service.saveOrder(order);
	}
	
	
	@GetMapping("/getorderbuserid/{userid}")
	public OrderResponseDto getOrderbUserid(@PathVariable String userid) {
		return service.getOrderbUserid(userid);
	}
	
	@GetMapping("/getorders")
	public OrderResponseDto getOrders() {
		return service.getOrders();
	}

}
