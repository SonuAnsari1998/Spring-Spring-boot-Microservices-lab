package com.nit.sbeans;

import java.util.List;
import java.util.Map;

public class Department {
	String departmentName;
	List<Employee> employees;

	public Department(String departmentName, List<Employee> employees) {
		this.departmentName = departmentName;
		this.employees = employees;
	}

	public void showDepartmentInfo() {
		
		
		
		System.out.println("Department: " + this.departmentName);
		
	}

}
