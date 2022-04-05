package com.serai.pizza.receive.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jaina
 */

@Entity
@Table(name = "ORDERREQUEST")
public class OrderRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "requestid")
	int requestId;
	@Column
	String item;
	@Column
	int quantity;
	@Column
	long price;

	public OrderRequest() {

	}

	public OrderRequest(int requestId, String item, int quantity, long price) {
		this.requestId = requestId;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}