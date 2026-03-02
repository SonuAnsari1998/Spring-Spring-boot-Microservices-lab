package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("paytmPayService")
public class PaytmPaymentService implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+" using Paytm");
		

	}

}
