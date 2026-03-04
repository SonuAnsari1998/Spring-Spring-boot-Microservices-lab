package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("commercial")
public class CommercialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		double perunit = 8;
		System.out.println("Per Unit: " + perunit);
		return units * perunit;
	}

}
