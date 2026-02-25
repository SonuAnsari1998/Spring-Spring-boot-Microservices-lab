package com.nit.sbeans;

import java.util.Map;

public class Company {
	String companyName;
	Map<String, Department> department;

	public Company(String companyName, Map<String, Department> department) {
		this.companyName = companyName;
		this.department = department;
	}

	public void showCompanyInfo() {
		department.forEach((k,v)->System.out.println(k+"   "+v));
		
		System.out.println("Company: " + this.companyName);
	}

}
