package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	private double taxPercentage;

	public Employee(int id, String name, double basicSalary, double hra, double da, double taxPercentage) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.taxPercentage = taxPercentage;
	}

}
