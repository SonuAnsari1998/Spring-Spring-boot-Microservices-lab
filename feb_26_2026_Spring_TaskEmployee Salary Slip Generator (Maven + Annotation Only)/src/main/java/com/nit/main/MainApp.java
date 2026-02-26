package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.AppConfig.AppConfig;
import com.nit.sbeans.SalarySlipService;

public class MainApp {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			SalarySlipService salrySlip = ctx.getBean(SalarySlipService.class);
			salrySlip.generateSlip();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
