package com.nit.sbeans;

import org.springframework.stereotype.Component;


public class ElectricEngine implements Engine {

	@Override
	public String getEngineType() {
		return "ElectricEngine";
	}

}
