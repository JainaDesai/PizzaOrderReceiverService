package com.serai.pizza.receive.order.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.serai.pizza.receive.order.model.OrderRequest;
import com.serai.pizza.receive.order.repo.OrderRepository;

/**
 * @author Jaina
 */

@SpringBootTest
public class OrderReceiverServiceTest{
	
	@Autowired
	OrderReceiverService orderReceiverService;
	
	@MockBean
	OrderRepository orderRepository;
	
	@DisplayName("Test OrderReceiverService.persistOrder()")
	@Test
	void testPersistOrder() {
		List<OrderRequest> orderList = new ArrayList<OrderRequest>(
				Arrays.asList(new OrderRequest(1, "Veg Pizza", 1, 500), new OrderRequest(2, "Cheese Pizza", 2, 1000)));
		when(orderRepository.saveAll(orderList)).thenReturn(orderList);
		assertThat(orderReceiverService.persistOrder(orderList)).isEqualTo(true);
	}
}
