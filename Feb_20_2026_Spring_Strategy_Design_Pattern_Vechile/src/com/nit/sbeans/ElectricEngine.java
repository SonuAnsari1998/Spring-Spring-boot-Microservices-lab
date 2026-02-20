package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("Starting Diesel Engine...");
	}

}
