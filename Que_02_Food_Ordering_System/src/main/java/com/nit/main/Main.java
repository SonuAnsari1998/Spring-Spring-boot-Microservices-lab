package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Food;
import com.nit.sbeans.FoodFactory;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

		String type = IO.readln("Enter food type:");

		FoodFactory bean = ctx.getBean(FoodFactory.class);
		Food obj = bean.setFood(type);
		obj.prepareFood();
	}
}
