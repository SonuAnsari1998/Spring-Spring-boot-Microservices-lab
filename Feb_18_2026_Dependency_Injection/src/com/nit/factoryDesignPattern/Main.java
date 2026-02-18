package com.nit.factoryDesignPattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Engine e = context.getBean(Engine.class);  // object from factory
        e.start();
    }
}

