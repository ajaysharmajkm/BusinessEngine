package com.ajay.entity;

import java.util.List;

public class Order {
	
	private String name;
	private int orderNumber;
	private ShippingAddress address;
	private List<OrderDetails> orderDetails;
	private String agentCommission;
	
	
	public Order(String name, int id, ShippingAddress address, List<OrderDetails> orderDetails, String agentCommission) {
		super();
		this.name = name;
		this.orderNumber = id;
		this.address = address;
		this.orderDetails = orderDetails;
		this.agentCommission = agentCommission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return orderNumber;
	}

	public void setId(int id) {
		this.orderNumber = id;
	}

	public ShippingAddress getAddress() {
		return address;
	}

	public void setAddress(ShippingAddress address) {
		this.address = address;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getAgentCommission() {
		return agentCommission;
	}

	public void setAgentCommission(String agentCommission) {
		this.agentCommission = agentCommission;
	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", orderNumber=" + orderNumber + ", address=" + address + ", orderDetails="
				+ orderDetails + ", agentCommission=" + agentCommission + "]";
	}

	
	
}
