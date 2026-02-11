package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.WeekDayAnalyzer;

public class WeekDayMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nit/configure/applicationContext.xml");

		WeekDayAnalyzer week = (WeekDayAnalyzer) ctx.getBean("wmg");
		System.out.println(week.checkDayType());
	}
}
