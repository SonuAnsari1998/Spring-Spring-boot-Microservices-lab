package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VechileService {
	
	@Autowired
	private VehicleFactory vehicleFactory;
	
	public Vehicle createVehicle(String type, String engineType) {
		return vehicleFactory.createVehicle(type, engineType);
	}

}
