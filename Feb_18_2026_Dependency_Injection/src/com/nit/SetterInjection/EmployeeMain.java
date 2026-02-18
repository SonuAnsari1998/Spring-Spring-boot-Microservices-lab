package com.nit.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nit/DependencyInjection/configureContext.xml");

		Employee bean = (Employee) context.getBean("emp");
		System.out.println(bean);
	}
}
