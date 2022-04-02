package com.ajay.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ajay.entity.Order;
import com.ajay.entity.OrderDetails;
import com.ajay.entity.ShippingAddress;

@Service
public class OrderServiceImpl implements OrderService {
	public List<Order> getList() {
		List<Order> order = new ArrayList();
		ShippingAddress shippingAddress = new ShippingAddress();
		shippingAddress.setCity("Bikaner");
		shippingAddress.setCompany("ABC Pvt ltd");
		shippingAddress.setCountry("IN");
		shippingAddress.setEmail("ajaysharma@gmail.com");
		shippingAddress.setZipCode("32425242");
		shippingAddress.setPhoneNo("993242424323");
		shippingAddress.setStreet("6 Cross, 6 main BTM, BTM Main Road");
		shippingAddress.setName("Ajay Sharma");
		shippingAddress.setState("KA");

		OrderDetails details = new OrderDetails(23131l, 99343l, "2", "430/-Rs");
		OrderDetails details1 = new OrderDetails(134l, 3423l, "5", "340/-Rs");
		OrderDetails details2 = new OrderDetails(2931l, 56343l, "1", "290/-Rs");
		OrderDetails details3 = new OrderDetails(231l, 9442l, "9", "130/-Rs");

		ArrayList<OrderDetails> list = new ArrayList();
		list.add(details3);
		list.add(details2);
		list.add(details1);
		list.add(details);

		order.add(new Order("Books", 1, shippingAddress, list, "10%"));
		order.add(new Order("Tools", 2, shippingAddress, list, "12%"));
		order.add(new Order("Tables", 3, shippingAddress, list, "15%"));
		order.add(new Order("Chairs", 4, shippingAddress, list, "18%"));
		order.add(new Order("Toys", 5, shippingAddress, list, "32%"));
		order.add(new Order("Machine Parts", 6, shippingAddress, list, "22%"));
		order.add(new Order("Bikes", 7, shippingAddress, list, "11%"));
		order.add(new Order("Cars", 8, shippingAddress, list, "09%"));
		order.add(new Order("Scocties", 9, shippingAddress, list, "08%"));
		order.add(new Order("Laptops", 10, shippingAddress, list, "10%"));
		
		return order;

	}

	public Order doService(int id) {
		Order s = getList().stream().filter(user -> user.getId() == id).findAny().orElse(null);
		return s;
	}

}
