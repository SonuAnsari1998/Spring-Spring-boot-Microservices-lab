package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("php")
public class PHPCourseMeterial implements ICourseMeterial {

	@Override
	public void prepration() {
		System.out.println("PHP Course meterial");
	}

}
