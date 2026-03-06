package com.nit.sbeans;

import org.springframework.stereotype.Component;

public class Truck implements Vehicle {

	private Engine engine;
	private int loadCapacity;

	public Truck(Engine engine, int loadCapacity) {
		super();
		this.engine = engine;
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String getDescription() {
		return "Truck";
	}

}
