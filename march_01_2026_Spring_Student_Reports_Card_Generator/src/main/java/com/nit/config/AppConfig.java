package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Student;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {
	
	@Bean
	public Student stu() {
		return new Student(101, "sonu", 56, 89, 75);
	}
}
