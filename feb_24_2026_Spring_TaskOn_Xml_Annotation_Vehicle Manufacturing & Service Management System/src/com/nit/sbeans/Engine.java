package com.nit.sbeans;

public class Engine {
	String engineType;
	int horsePower;

	public Engine(String engineType, int horsePower) {
		System.out.println("Engine.Engine()");
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	
	public String  showEngineDetails() {
		return "Engine Details :"+
				" Engine Type: "+this.engineType+
				", Horse Power: "+this.horsePower;
	}

}
