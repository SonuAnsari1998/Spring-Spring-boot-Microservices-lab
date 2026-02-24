package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	String vehicleName;
	Engine engine;
	Tyre tyre;

	public void setVehicleName(String vehicleName) {
		System.out.println("Vehicle.setVehicleName()");
		this.vehicleName = vehicleName;
	}
	
	public Vehicle(Engine engine) {
		System.out.println("Vehicle.Vehicle()");
		this.engine = engine;
	}

	
	
	
	


	public String displayVehicleInfo() {
		return "Vehicle Name:"+vehicleName+engine.showEngineDetails()+" "+tyre.showTyreDetails();
	}


   
	public void setTyre(Tyre tyre) {
    	System.out.println("Vehicle.setTyre()");
		this.tyre = tyre;
	}

}
