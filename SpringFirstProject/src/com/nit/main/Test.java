package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nit.sbeans.WishMessageGenerator;

public class Test {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nit/configure/applicationContext.xml");
		
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		String result = generator.showMessage("sonu");
		System.out.println(result);
		String showSeason = generator.showSeason();
		System.out.println(showSeason);
		ctx.close();
	}
}
