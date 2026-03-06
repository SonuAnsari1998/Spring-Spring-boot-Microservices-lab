package com.nit.sbeans;

import org.springframework.stereotype.Component;


public class DieselEngine implements Engine {

	@Override
	public String getEngineType() {
		return "DieselEngine";
	}

}
