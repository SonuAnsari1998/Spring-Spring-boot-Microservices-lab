package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.NotificationService;

@Configuration
@ComponentScan("com.nit.sbeans")
public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainApp.class);
		NotificationService msg = ctx.getBean(NotificationService.class);
		msg.notifyUser("Meeting at 4 PM");
	}
}
