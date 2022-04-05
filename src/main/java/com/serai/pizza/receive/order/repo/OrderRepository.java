package com.serai.pizza.receive.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serai.pizza.receive.order.model.OrderRequest;

/**
 * @author Jaina
 */

public interface OrderRepository extends JpaRepository<OrderRequest, Integer>{

}
