package com.nit.sbeans;

import org.springframework.stereotype.Component;


public class Motorcycle implements Vehicle {

	private Engine engine;
	private int sideCar;
	
	
	public Motorcycle(Engine engine, int sideCar) {
		super();
		this.engine = engine;
		this.sideCar = sideCar;
	}


	@Override
	public String getDescription() {
		return "Motorcycle";
	}

}
