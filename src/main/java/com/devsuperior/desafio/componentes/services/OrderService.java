package com.devsuperior.desafio.componentes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio.componentes.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public Double total(Order order) {
		Double porcentagemCalculada = calculoPorcentagemDesconto(order);
//		System.out.println("Basico " + order.getBasic() + ", Desconto " + porcentagemCalculada + " Frete " + shippingService.shipment(order));
		return order.getBasic() - porcentagemCalculada + shippingService.shipment(order);
	}
	
	public Double calculoPorcentagemDesconto(Order order) {
		Double porcentagem = order.getBasic();
		return porcentagem * ( order.getDiscount() / 100);
	}
	
}
