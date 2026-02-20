package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vichile {
	@Autowired
	@Qualifier("diesel")
	private IEngine engine;

	public void journey() {
		engine.start();
		System.out.println("Vehicle is moving...");
	}

	@Override
	public String toString() {
		return "Vichile is ready with engine: " + engine.getClass().getSimpleName();
	}
}
