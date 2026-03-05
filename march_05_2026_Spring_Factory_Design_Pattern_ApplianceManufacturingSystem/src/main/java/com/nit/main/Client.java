package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Appliance;
import com.nit.sbeans.ApplianceFactory;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Client.class);

		String type = IO.readln("Enter Product type (washingMachine or refrigerator):");

		ApplianceFactory bean = ctx.getBean(ApplianceFactory.class);
		Appliance appliance = bean.getAppliance(type);
		appliance.manufacture();
	}
}
