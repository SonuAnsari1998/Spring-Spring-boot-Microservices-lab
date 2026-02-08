package com.nit.beans;

public class Employee {
	String name;
	double salary;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String displayInfo() {
		return "Name: " + this.name + " Salary: " + this.salary;
	}
}
