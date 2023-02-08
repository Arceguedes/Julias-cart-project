package com.juliaguedes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliaguedes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
