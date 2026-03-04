package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ElectricityBillingSystem {

	BillingStrategy billingStrategy;

	public void setBillingStrategy(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}

	public void showBill(double units) {
		System.out.println("Units Consumed: " + units);
		System.out.println("Total Bill Amount: ₹" + (billingStrategy.calculateBill(units)));
	}
}
