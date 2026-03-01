package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportCardService {
	@Autowired
	private Student stu;

	public void generateReport() {
		double totalMarks = stu.getMathMarks() + stu.getScienceMarks() + stu.getEnglishMarks();
		double percentage = (totalMarks / 300) * 100;

		if (percentage > 80 && percentage <= 100) {
			System.out.println("Grade -> A");
		} else if (percentage >= 60 && percentage < 80) {
			System.out.println("Grade -> B");
		} else if (percentage >= 40 && percentage < 60) {
			System.out.println("Grade -> C");
		} else if (percentage >= 0 && percentage < 40) {
			System.out.println("Grade -> F");
		}
	}
}
