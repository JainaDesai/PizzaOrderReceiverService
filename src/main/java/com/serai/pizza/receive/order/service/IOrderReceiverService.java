package com.serai.pizza.receive.order.service;

import java.util.List;

import com.serai.pizza.receive.order.model.OrderRequest;

/**
 * @author Jaina
 */

public interface IOrderReceiverService {

	public Boolean persistOrder(List<OrderRequest> orderRequest);

}
