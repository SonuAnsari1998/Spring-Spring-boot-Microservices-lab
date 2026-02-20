package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("javacourse")
public class JavaCourseMeterial implements ICourseMeterial{

	@Override
	public void prepration() {
		System.out.println("Java Course Meterial");
		
	}

}
