package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("mrf")
public class MRFBat implements ICricket {

	@Override
	public void run() {
		System.out.println("Cricket Play with MRFBat");

	}

}
