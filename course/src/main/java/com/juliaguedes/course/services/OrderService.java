package com.juliaguedes.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliaguedes.course.entities.Order;
import com.juliaguedes.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
