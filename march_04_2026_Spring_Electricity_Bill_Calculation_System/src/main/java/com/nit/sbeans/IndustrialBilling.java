package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("industrial")
public class IndustrialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		double perunit = 10;
		System.out.println("Per Unit: " + perunit);
		return units * perunit;
	}

}
