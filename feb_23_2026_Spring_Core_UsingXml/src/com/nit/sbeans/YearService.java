package com.nit.sbeans;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class YearService {
	private LocalDate date;

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getMonth() {
		Month month = date.getMonth();
		if (month == Month.JANUARY) {
			return "Happy New Year!";
		} else if (month == Month.DECEMBER) {
			return "Get ready for the new year!";
		} else {
			return "Regular month.";
		}
	}
}
