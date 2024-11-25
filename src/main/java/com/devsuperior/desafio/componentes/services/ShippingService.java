package com.devsuperior.desafio.componentes.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.componentes.entities.Order;

@Service
public class ShippingService {

	public Double shipment(Order order){
		
		if (order.getBasic() < 100.00) {
//			System.out.println("Entrou 1: " + order.getBasic());
			return 20.0;
		}else if (order.getBasic() >= 100.00 && order.getBasic() < 200.0) {
//			System.out.println("Entrou 2: " + order.getBasic());
			return 12.0;
		}else {
//			System.out.println("Entrou 3: " + order.getBasic());
			return 0.0;
		}
		 
	}
	
}
