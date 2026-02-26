package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.LaptopService;

public class LaptopMain {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			LaptopService lap = ctx.getBean(LaptopService.class);
			System.out.println("===Laptop Configuration Printer Details====");
			lap.printLaptopDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
