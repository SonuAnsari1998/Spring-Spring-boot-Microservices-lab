package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.BillingStrategy;
import com.nit.sbeans.ElectricityBillingSystem;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainApp.class);
		String type = IO.readln("Enter customer type (residential/commercial/industrial): industrial").toLowerCase();
		double units = Double.parseDouble(IO.readln("Enter total units consumed:"));
		BillingStrategy billStrategy = (BillingStrategy) ctx.getBean(type);
		ElectricityBillingSystem electricityBillingSystem = ctx.getBean(ElectricityBillingSystem.class);

		System.out.println("Customer Type: " + type);
		electricityBillingSystem.setBillingStrategy(billStrategy);
		electricityBillingSystem.showBill(units);

	}
}
