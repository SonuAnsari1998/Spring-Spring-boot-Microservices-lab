package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class BillCalculator {

	public double calculateBill(double units) {
		double unit = 0;
		if (units > 0 && units <= 100) {
			unit = 2;
		} else if (units > 100 && units <= 200) {
			unit = 4;
		} else if (units > 200) {
			unit = 6;
		}

		return unit;

	}
}
