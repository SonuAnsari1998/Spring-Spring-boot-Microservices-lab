package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceCenter {
	
	Vehicle vehicle;
	String serviceType;

	public void setServiceType(String serviceType) {
		System.out.println("ServiceCenter.setServiceType()");
		this.serviceType = serviceType;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String performService() {
		return "ServiceCenter [vehicle=" + vehicle.displayVehicleInfo() + ", serviceType=" + serviceType + "]";
	}

}
