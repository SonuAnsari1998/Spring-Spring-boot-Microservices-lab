package com.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.nit.sbeans.ShoppingService;

@Component
public class ShoppingContext {

	ShoppingService shoppingService;
	
	public ShoppingContext(ShoppingService shoppingService) {
		this.shoppingService = shoppingService;
	}
	
	public void addItem(String name, double price) {
		shoppingService.addItem(name, price);
	}
	
	public void checkout() {
		shoppingService.checkout();
	}
	
	public void viewCart() {
		shoppingService.viewCart();
	}

}
