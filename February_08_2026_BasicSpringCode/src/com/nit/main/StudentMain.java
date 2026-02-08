package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.beans.Employee;
import com.nit.beans.Student;

public class StudentMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nit/configure/applicationContext.xml");
		// Student
//		Student s1 = (Student) ctx.getBean("student");
//		System.out.println(s1.showName());

		// Employee
//		Employee e1 = (Employee) ctx.getBean("employee");
//		System.out.println(e1.displayInfo());
		
		
	}
}
