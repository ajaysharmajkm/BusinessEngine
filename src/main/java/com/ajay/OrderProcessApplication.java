package com.ajay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration 
@SpringBootApplication
public class OrderProcessApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(OrderProcessApplication.class, args);
	}
	
	
	
}
