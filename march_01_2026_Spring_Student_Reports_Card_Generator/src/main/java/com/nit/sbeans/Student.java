package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class Student {
	private int id;
	private String name;
	private double mathMarks;
	private double scienceMarks;
	private double englishMarks;
}
