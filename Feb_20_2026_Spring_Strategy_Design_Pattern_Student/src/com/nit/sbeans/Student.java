package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	@Qualifier("dotnet")
	private ICourseMeterial courseMeterial;

	public void courseStart() {
		courseMeterial.prepration();
	}

	public String toString() {
		return "Complited!!!";
	}

}
