package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.Engine;
import com.nit.sbeans.ServiceCenter;
import com.nit.sbeans.Tyre;
import com.nit.sbeans.Vehicle;
/*Expected Output
----------------
=== Vehicle Manufacturing & Service System ===
Engine Details: Type = Diesel, HorsePower = 180
Tyre Details: Brand = MRF, Size = 18
Vehicle: Toyota Fortuner
Service Type: Full Engine Checkup*/

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/config/SpringConfig.xml");
		
		System.out.println("=== Vehicle Manufacturing & Service System ===");
		
		ServiceCenter service = ctx.getBean(ServiceCenter.class);
		System.out.println(service.performService());
		
		
		
	}
}

