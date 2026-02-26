package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalarySlipService {
	@Autowired
	private Employee employee;

	public void generateSlip() {
		double grossSalary = employee.getBasicSalary() + employee.getHra() + employee.getDa();
		double taxAmount = (grossSalary * employee.getTaxPercentage()) / 100;
		double netSalary = grossSalary - taxAmount;

		
	IO.println("Salary Slip for "+employee.getName()+"\r\n"
			+ "Gross Salary: "+grossSalary+"\r\n"
			+ "Tax Deducted: "+taxAmount+"\r\n"
			+ "Net Salary: "+netSalary);
	}
}
