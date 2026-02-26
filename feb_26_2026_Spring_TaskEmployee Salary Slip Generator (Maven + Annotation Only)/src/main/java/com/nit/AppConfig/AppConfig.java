package com.nit.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Employee;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {

	@Bean("employee")
	public Employee emp() {
		return new Employee(101, "John", 75600, 2500, 3600, 10);
	}
}
