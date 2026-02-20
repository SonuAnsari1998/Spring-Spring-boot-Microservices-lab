package com.nit.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Employee {
	@Value("101")
	private int id;
	@Value("sonu")
	private String name;
	@Value("78555")
	private double salary;
	@Autowired
	private Product product;

	public Product getProduct() {
		return product;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", product=" + product + "]";
	}

}
