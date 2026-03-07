package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("burger")
public class Burger implements Food {

	@Override
	public void prepareFood() {
		System.out.println("Preparing Burger...");
		System.out.println("Burger is ready to serve");
	}

}
