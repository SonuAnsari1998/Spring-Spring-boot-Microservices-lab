package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.PaymentProcessor;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainApp.class);
		PaymentProcessor payment = ctx.getBean(PaymentProcessor.class);
		payment.processPayment(500);
	}
}
