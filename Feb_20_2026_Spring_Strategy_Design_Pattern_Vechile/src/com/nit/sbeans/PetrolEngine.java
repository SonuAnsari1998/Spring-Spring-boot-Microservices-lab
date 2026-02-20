package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IEngine{

	@Override
	public void start() {
		 System.out.println("Starting Petrol Engine...");
		
	}

}
