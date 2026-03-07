package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pizza")
public class Pizza implements Food {

	@Override
	public void prepareFood() {
		System.out.println("Preparing Pizza...");
		System.out.println("Pizza is ready to serve");

	}

}
