package com.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Product;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {

	@Bean("product")
	public Product pro() {
		return new Product("Laptop", 50000, 2);
	}
}
