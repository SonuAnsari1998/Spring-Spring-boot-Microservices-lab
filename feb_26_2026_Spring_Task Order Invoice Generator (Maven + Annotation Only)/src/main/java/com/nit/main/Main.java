package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.InvoiceService;

public class Main {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			InvoiceService product = ctx.getBean(InvoiceService.class);
			product.printInvoice();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
