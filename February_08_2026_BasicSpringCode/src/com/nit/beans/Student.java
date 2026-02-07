package com.nit.beans;

public class Student {
	private String name;
	public void setName(String name) {
		this.name=name;
	}
	public String showName() {
		return "Student Name: "+this.name;
	}
}
