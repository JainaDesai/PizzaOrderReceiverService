package com.serai.pizza.receive.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serai.pizza.receive.order.model.OrderRequest;
import com.serai.pizza.receive.order.repo.OrderRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Jaina
 */

@Service
@Slf4j
public class OrderReceiverService implements IOrderReceiverService {
	
	@Autowired 
	OrderRepository orderRepository;

	@Override
	public Boolean persistOrder(List<OrderRequest> orderRequest) {
		log.info("Inside persistOrder() of OrderReceiverService");
		orderRepository.saveAll(orderRequest);
		return true;
	}
	

}
