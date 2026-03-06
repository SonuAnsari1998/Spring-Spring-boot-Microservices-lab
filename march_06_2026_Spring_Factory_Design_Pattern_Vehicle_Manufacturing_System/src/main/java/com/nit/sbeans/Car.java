package com.nit.sbeans;

import org.springframework.stereotype.Component;


public class Car implements Vehicle {

	private Engine engine;
	private int noOfDoor;
	
	
	public Car(Engine engine, int noOfDoor) {
		super();
		this.engine = engine;
		this.noOfDoor = noOfDoor;
	}


	@Override
	public String getDescription() {
		return "Car";
	}

}
