package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.LaptopEMICalculator;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {

	@Bean
	public LaptopEMICalculator calculator() {
		return new LaptopEMICalculator(60000, 10000, 10);
	}

}
