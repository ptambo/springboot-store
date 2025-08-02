package com.ptambo.springboot_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootStoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootStoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
