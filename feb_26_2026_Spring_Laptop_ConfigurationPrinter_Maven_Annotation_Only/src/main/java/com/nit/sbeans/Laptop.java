package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
public class Laptop {
	String brand;
	String processor;
	String ram;

	public Laptop(String brand, String processor, String ram) {
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
	}

}
