package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Flipkart;

public class StategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fkt = ctx.getBean("fpkt", Flipkart.class);
		String resultMsg = fkt.shopping(new String[] { "shoes", "T-shirt" }, new double[] { 5500, 5600 });
		System.out.println(resultMsg);
	}
}
