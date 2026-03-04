package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("residential")
public class ResidentialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		double perunit = 5;
		System.out.println("Per Unit: " + perunit);
		return units * perunit;
	}

}
