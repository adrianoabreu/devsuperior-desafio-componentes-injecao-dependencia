package com.devsuperior.desafio.componentes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.desafio.componentes.entities.Order;
import com.devsuperior.desafio.componentes.services.OrderService;

@SpringBootApplication
//@ComponentScan("com.devsuperior.desafio")
public class ComponentesApplication implements CommandLineRunner {

	private OrderService orderService;
	
	public ComponentesApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034,150.00,20.0);
		System.out.println("Pedido codigo " + order.getCode());
		System.out.println("Valor Total:  " + orderService.total(order));
		
		Order order2 = new Order(2282,800.00,10.0);
		System.out.println("Pedido codigo " + order2.getCode());
		System.out.println("Valor Total:  " + orderService.total(order2));
		
		Order order3 = new Order(1309,95.90,0.0);
		System.out.println("Pedido codigo " + order3.getCode());
		System.out.println("Valor Total:  " + orderService.total(order3));
	}

}
