package com.nit.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Student;

public class CourseTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Student bean = ctx.getBean(Student.class);
		bean.courseStart();

	}
}
