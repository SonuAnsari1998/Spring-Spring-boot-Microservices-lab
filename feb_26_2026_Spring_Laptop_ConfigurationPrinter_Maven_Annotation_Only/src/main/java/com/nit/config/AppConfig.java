package com.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Laptop;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {

	@Bean("laptop")
	public Laptop laptop() {
		return new Laptop("Dell", "Intel i7", "16GB");
	}
}
