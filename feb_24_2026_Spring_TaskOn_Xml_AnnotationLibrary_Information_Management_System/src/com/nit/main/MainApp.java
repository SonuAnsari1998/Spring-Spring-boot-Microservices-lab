package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.Librarian;

/*=== Library Information System ===
Library: City Central Library
Managed By: Mr. John
Books Available:
  - Book: Spring Framework Essentials | Author: Martin Fowler
  - Book: Clean Code | Author: Robert C. Martin*/

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/config/SpringConfig.xml");
		
		System.out.println("=== Library Information System ===");
		
		Librarian librarian = (Librarian) ctx.getBean("librarian");
		System.out.println(librarian.manageLibrary());
		
		
		
	}
}

