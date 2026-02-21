package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("ssb")
public class SSBat implements ICricket {

	@Override
	public void run() {
		System.out.println("Cricket Play with MRFBat");
	}

}
