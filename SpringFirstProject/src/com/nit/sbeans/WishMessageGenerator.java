package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class WishMessageGenerator {
	private LocalTime time;
	private LocalDate date;

	public WishMessageGenerator() {
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String showMessage(String name) {
		int hour = time.getHour();
		if (hour < 12) {
			return "Good Morning " + name;
		} else if (hour < 16) {
			return "Good Afternoon " + name;
		}
		if (hour < 20) {
			return "Good Evening " + name;
		} else {
			return "Good Night";
		}
	}

	public String showSeason() {
		Month month = date.getMonth();
		int m = month.getValue();

		if (m >= 3 && m <= 5)
			return "Spring";
		else if (m >= 6 && m <= 8)
			return "Summer";
		else if (m >= 9 && m <= 11)
			return "Autumn";
		else
			return "Winter";
	}

}
