package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext application = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentRepository operation = application.getBean("studentRepository",StudentRepository.class);
        operation.addStudent();
        System.out.println(operation.getStudent());
        operation.updateStudentName();
        System.out.println(operation.getStudent());
        System.out.println(operation.getStudentByID());
    }
}
