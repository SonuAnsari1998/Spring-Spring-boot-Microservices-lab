package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekDayAnalyzer {
	LocalDate date;

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String checkDayType() {
		DayOfWeek day = date.getDayOfWeek();
		if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
			return "Today (" + day + ") is Weekend 🎉";
		} else {
			return "Today (" + day + ") is Weekday 💼";
		}
	}

}
