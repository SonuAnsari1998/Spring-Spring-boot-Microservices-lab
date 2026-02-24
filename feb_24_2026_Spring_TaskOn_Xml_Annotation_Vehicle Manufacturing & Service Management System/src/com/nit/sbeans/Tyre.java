package com.nit.sbeans;
public class Tyre {
	String brand;
	double size;
	
	
	


	public void setBrand(String brand) {
		System.out.println("Brand");
		this.brand = brand;
	}





	public void setSize(double size) {
		System.out.println("SIZe");
		this.size = size;
	}





	public String showTyreDetails() {
		return "Tyre Details :"+
				" Brand: "+this.brand+
				", Size: "+this.size;
	}
	
}
