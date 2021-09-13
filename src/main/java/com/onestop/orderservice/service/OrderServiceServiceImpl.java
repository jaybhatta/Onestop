package com.onestop.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onestop.orderservice.model.Order;
import com.onestop.orderservice.repository.OrderServiceRepo;

@Service
public class OrderServiceServiceImpl implements OrderServiceService{

	
	private OrderServiceRepo orderservicerepo;
	@Autowired
	public OrderServiceServiceImpl(OrderServiceRepo orderservicerepo) {
		
		this.orderservicerepo = orderservicerepo;
	}

	@Override
	public Order getOrderById(int id) {
		return orderservicerepo.getById(id);
	
	}

	@Override
	public void saveOrder(Order order) {
		 orderservicerepo.save(order);
		
	}


}
