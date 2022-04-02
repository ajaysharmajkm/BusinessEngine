package com.ajay.SprngBWeb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ajay.entity.Order;
import com.ajay.service.OrderServiceImpl;

public class OrderServiceImplTest {

	@Test
	public void testOrderServiceImplTest1() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(1);
		assertEquals("Books", order.getName());
		assertEquals(1, order.getOrderNumber());
		assertEquals("10%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest2() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(2);
		assertEquals("Tools", order.getName());
		assertEquals(2, order.getOrderNumber());
		assertEquals("12%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest3() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(3);
		assertEquals("Tables", order.getName());
		assertEquals(3, order.getOrderNumber());
		assertEquals("15%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest4() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(4);
		assertEquals("Chairs", order.getName());
		assertEquals(4, order.getOrderNumber());
		assertEquals("18%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest5() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(5);
		assertEquals("Toys", order.getName());
		assertEquals(5, order.getOrderNumber());
		assertEquals("32%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest6() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(6);
		assertEquals("Machine Parts", order.getName());
		assertEquals(6, order.getOrderNumber());
		assertEquals("22%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest7() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(7);
		assertEquals("Bikes", order.getName());
		assertEquals(7, order.getOrderNumber());
		assertEquals("11%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest8() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(8);
		assertEquals("Cars", order.getName());
		assertEquals(8, order.getOrderNumber());
		assertEquals("09%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest9() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(9);
		assertEquals("Scocties", order.getName());
		assertEquals(9, order.getOrderNumber());
		assertEquals("08%", order.getAgentCommission());		
	}
	
	@Test
	public void testOrderServiceImplTest10() {
		OrderServiceImpl impl = new OrderServiceImpl();
		Order order = impl.doService(10);
		assertEquals("Laptops", order.getName());
		assertEquals(10, order.getOrderNumber());
		assertEquals("10%", order.getAgentCommission());		
	}
	
	
}
