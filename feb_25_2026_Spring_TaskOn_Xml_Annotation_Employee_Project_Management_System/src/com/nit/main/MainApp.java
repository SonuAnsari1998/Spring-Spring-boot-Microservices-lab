package com.nit.main;
/*=== Company Structure ===
Company: TechWave Solutions
Department: IT
  Employee: Alice | Project: Web Application (6 Months)
Department: HR
  Employee: Bob | Project: Recruitment System (3 Months)*/

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.Company;
public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
															"com/nit/config/SpringConfig.xml");
		
		Company company =  ctx.getBean(Company.class);
		company.showCompanyInfo();
		
		
		
		
		
	}
}

