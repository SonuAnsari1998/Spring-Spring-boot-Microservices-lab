package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.AmazonService;
import com.nit.sbeans.FlipkartService;
import com.nit.sbeans.ShoppingService;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class ShoppingApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ShoppingApplication.class);

		System.out.println("Choose Platform");
		System.out.println("1. Amazon");
		System.out.println("2. FlipKart");

		int choice = Integer.parseInt(IO.readln("Enter your choice"));
		ShoppingService shoppingService = null;

		if (choice == 1) {
			shoppingService = ctx.getBean(AmazonService.class);
		} else if (choice == 2) {
			shoppingService = ctx.getBean(FlipkartService.class);
		} else {
			System.err.println("Invalid choice");
		}

		while (true) {
			System.out.println("1. Add Items");
			System.out.println("2. View Cart");
			System.out.println("3. Checkout");
			System.out.println("4. Exit");

			int ch = Integer.parseInt(IO.readln("Enter your choice!!!"));

			switch (ch) {

			case 1 -> {
				String name = IO.readln("Enter Product Name");
				double price = Double.parseDouble(IO.readln("Enter Product price"));
				shoppingService.addItem(name, price);
			}
			case 2 -> {
				shoppingService.viewCart();
			}
			case 3 -> {
				shoppingService.checkout();
			}
			case 4 -> {
				System.out.println("Thank you!!!");
				System.exit(0);
			}

			default -> System.err.println("Invalid choice!!!!");
			}
		}

	}
}
