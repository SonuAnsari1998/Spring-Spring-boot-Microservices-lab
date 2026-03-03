package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.LaptopEMICalculator;

public class LaptopEMICalculatorMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		LaptopEMICalculator bean = ctx.getBean(LaptopEMICalculator.class);
		
		System.out.println("Monthly EMI: "+bean.calculateMonthlyEMI());
	}
}
