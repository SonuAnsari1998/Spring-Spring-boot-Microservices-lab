package com.nit.ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext(
				"com/nit/ConstructorInjection/ConfigureContext.xml");
		
		System.out.println(contex.getBean("product"));
	}

}
