package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
public class Product {
	private String name;
	private double price;
	private int qty;
	public Product(String name, double price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	

}
