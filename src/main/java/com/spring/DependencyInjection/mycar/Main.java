package com.spring.DependencyInjection.mycar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("mycar.xml");
        Car car = application.getBean("car",Car.class);
        car.Start();
    }
}
