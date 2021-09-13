package com.onestop.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onestop.orderservice.model.Order;
import com.onestop.orderservice.service.OrderServiceService;

@RestController
public class OrderController {
	
	
	private OrderServiceService orderServiceService;
	 @Autowired
	    public OrderController(OrderServiceService orderServiceService) {
			
			this.orderServiceService = orderServiceService;
		}
	
	
    @GetMapping("/{id}")
	public Order getOrder(@PathVariable int id) {
		return orderServiceService.getOrderById(id);
	}
     


	@PostMapping("/order")
    public void saveOrder(@RequestBody Order order) {
    	orderServiceService.saveOrder(order);
    	
    }

}
