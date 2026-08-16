package com.spring.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("spring.xml");
        Student student =(Student) application.getBean("student");
        /*
        * The code is now not tight coupling
        * Why ? because Main does not know the object , it gets object from Spring container
        * just replace the class="com.spring.xmlconfig.CollegeStudent in spring.xml
        * */
        System.out.println(student.toString());
    }
}
