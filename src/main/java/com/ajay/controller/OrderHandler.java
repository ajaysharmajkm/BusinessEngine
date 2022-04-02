package com.ajay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.entity.Order;
import com.ajay.entity.Royalty;
import com.ajay.service.OrderServiceImpl;
import com.ajay.service.RoyaltyServiceImpl;
import com.ajay.utils.Utils;


@RestController
@RequestMapping("/payment")
public class OrderHandler {
	
	@Autowired
	private OrderServiceImpl orderService;
	
	@Autowired
	private RoyaltyServiceImpl royaltyServiceImpl;
	
	@PostMapping("/physical/{id}")
	public Order getOrderRequest(@PathVariable("id") int orderId) {
		return orderService.doService(orderId);
	}
	
	@PostMapping("/book")
	public Royalty getRoyaltyRequest() {
		return royaltyServiceImpl.doService();
	}
	
	
	@PostMapping("/memberShip/{id}")
	public String getmemberShipRequest(@PathVariable("id") int memberId) {
		Utils.sendEmail(memberId);
		return "Membership Id :" + memberId + " activated";
	}
	
	@PatchMapping("/memberShip/{id}")
	public String getMemberUpgrade(@PathVariable("id") int memberId) {
		Utils.sendEmail(memberId);
		return "Membership upgraded for Id :" + memberId + "";
	}
	

}
