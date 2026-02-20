package com.nit.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("fpkt")
public class Flipkart {
	@Autowired
	@Qualifier("dtdc")
	private ICourier courier;

	public String shopping(String items[], double price[]) {
		double billAmount = 0;
		for (double p : price) {
			billAmount = billAmount + p;
		}
		int oid = new Random().nextInt(100000);
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + " are shopped having bill amount: " + billAmount + "-->" + msg;
	}
}
