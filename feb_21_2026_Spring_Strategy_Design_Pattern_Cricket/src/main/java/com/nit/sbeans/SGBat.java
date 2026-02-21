package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("sgb")
public class SGBat implements ICricket {

	@Override
	public void run() {
		System.out.println("Cricket Play with SGBat");
	}

}
