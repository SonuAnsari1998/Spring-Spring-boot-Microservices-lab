package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dotnet")
public class DotNetCourseMeterial implements ICourseMeterial {

	@Override
	public void prepration() {
		System.out.println("Dot Net course meterial");

	}

}
