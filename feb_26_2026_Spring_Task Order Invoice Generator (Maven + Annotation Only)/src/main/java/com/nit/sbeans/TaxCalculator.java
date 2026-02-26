package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

	public double calculateTax(double amount) {
		double tax = (18 * amount) / 100;
		return tax;
	}
}
