package com.nit.SetterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean("emp")
	public Employee name() {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("John");
		emp.setProduct(name1());
		return emp;
	}
	
	@Bean
	public Product name1() {
		Product p=new Product();
		p.setId(1001);
		p.setName("Laptop");
		return p;
	}
	
}
