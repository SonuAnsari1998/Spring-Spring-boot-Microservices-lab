package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.VechileService;
import com.nit.sbeans.Vehicle;
@Configuration
@ComponentScan(basePackages = "com")
public class Vehcilemain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Vehcilemain.class);
	VechileService vs = ctx.getBean(VechileService.class);
	Vehicle vehicle = vs.createVehicle("car","electric");
	String description = vehicle.getDescription();
	System.out.println(description);
	
	}

}
