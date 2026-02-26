package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	@Autowired
	private Laptop laptop;

	public void printLaptopDetails() {
		System.out.println("Laptop Brand: "+laptop.getBrand()+"\r\n"
				+ "Processor: "+laptop.getProcessor()+"\r\n"
				+ "RAM: "+laptop.getRam()+"");
	}
}
