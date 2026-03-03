package com.nit.sbeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class FlipkartService implements ShoppingService {

	Map<String, Double> productItem = new HashMap<>();
	double totalPrice;// 1400
	double discount;
	double finalBill;// 0
	double shippingFee;// 0

	@Override
	public void addItem(String item, double price) {
		productItem.put(item, price);

	}

	@Override
	public void checkout() {
		for (Map.Entry<String, Double> entry : productItem.entrySet()) {
			System.out.println("Item Name: " + entry.getKey() + " Price: " + entry.getValue());
		}

	}

	@Override
	public void viewCart() {
		for (Map.Entry<String, Double> entry : productItem.entrySet()) {
			totalPrice = totalPrice + entry.getValue(); // 400
		}

		if (totalPrice >= 0 && totalPrice <= 500) {
			shippingFee = 50;
		}

		discount = (5 * totalPrice) / 100; // 200
		finalBill = totalPrice - discount;// 1200
		System.out.println("Applying 10% Amazon Discount...");
		System.out.println("Discount: ₹" + this.discount);
		System.out.println("Final Amount to Pay: ₹" + this.finalBill + shippingFee);
		System.out.println("Delivery: Fast delivery within 2 days.");

	}
}
