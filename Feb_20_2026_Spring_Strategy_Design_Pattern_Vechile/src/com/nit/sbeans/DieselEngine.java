package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("Starting Diesel Engine...");

	}

}
