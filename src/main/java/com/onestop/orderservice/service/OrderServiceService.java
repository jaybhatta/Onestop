package com.onestop.orderservice.service;

import com.onestop.orderservice.model.Order;

public interface OrderServiceService {
	
	Order getOrderById(int id);
	void saveOrder(Order order);
	
	

}
