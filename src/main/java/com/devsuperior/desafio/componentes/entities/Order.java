package com.devsuperior.desafio.componentes.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devsuperior.desafio.componentes.services.OrderService;

@Component
public class Order {

	private Integer code;
	private Double basic;
	private Double discount;
	
	@Autowired
	private OrderService orderService;
	
	public Order() {
	}
	
	public Order(Integer code, Double basic, Double discount) {
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	
}
