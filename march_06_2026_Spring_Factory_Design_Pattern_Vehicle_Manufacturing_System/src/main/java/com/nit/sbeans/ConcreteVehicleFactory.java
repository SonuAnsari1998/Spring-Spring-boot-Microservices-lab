package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("concreteVehicleFactory")
public class ConcreteVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle(String type, String engineType) {
		Engine engine = null;

		if (engineType.equals("electric")) {
			engine = new ElectricEngine();
		} else if (engineType.equals("diesel")) {
			engine = new DieselEngine();
		}

		Vehicle vehicle = null;

		if (type.equals("car")) {
			return new Car(engine, 4);
		} else if (type.equals("truck")) {
			return new Truck(engine, 4000);
		}
		if (type.equals("moterCycle")) {
			return new Motorcycle(engine, 2);
		}

		return null;
	}

}
