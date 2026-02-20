package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.PetrolEngine;
import com.nit.sbeans.Vichile;

public class VichileTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Vichile v1 = ctx.getBean(Vichile.class);
		v1.journey();
		System.out.println(v1);
		
	}
}
