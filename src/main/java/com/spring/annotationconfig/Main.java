package com.spring.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(Application.class);
        Bike bike = app.getBean("bike", Bike.class);
        bike.start();
    }
}
