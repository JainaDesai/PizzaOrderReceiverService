package com.serai.pizza.receive.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serai.pizza.receive.order.model.OrderRequest;
import com.serai.pizza.receive.order.service.IOrderReceiverService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Jaina
 */

@RestController
@Slf4j
public class OrderReceiverController {
	
	@Autowired
	IOrderReceiverService orderReceiverService;
	
	@PostMapping(value = "/persistOrder")
    ResponseEntity<?> persistOrder(@RequestBody List<OrderRequest> orderRequest) {
		log.info("Inside persistOrder() of OrderReceiverController");
        try {
            Boolean response = orderReceiverService.persistOrder(orderRequest);
            if (response != null) {
                return new ResponseEntity<>(response.booleanValue(), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>("Failed to persist order.", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
