package com.ajay.entity;

public class OrderDetails {
	
	private Long numbers;
	private Long orderValue;
	private String discount;
	private String shippingCharges;
		
	
	public OrderDetails(Long numbers, Long orderValue, String discount, String shippingCharges) {
		super();
		this.numbers = numbers;
		this.orderValue = orderValue;
		this.discount = discount;
		this.shippingCharges = shippingCharges;
	}


	public Long getNumbers() {
		return numbers;
	}


	public void setNumbers(Long numbers) {
		this.numbers = numbers;
	}


	public Long getOrderValue() {
		return orderValue;
	}


	public void setOrderValue(Long orderValue) {
		this.orderValue = orderValue;
	}


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
	}


	public String getShippingCharges() {
		return shippingCharges;
	}


	public void setShippingCharges(String shippingCharges) {
		this.shippingCharges = shippingCharges;
	}


}
