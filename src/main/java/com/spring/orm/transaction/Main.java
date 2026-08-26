package com.spring.orm.transaction;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        EntityManagerFactory factory =app.getBean(EntityManagerFactory.class);
        CustomerRepository customer=app.getBean("customerRepository",CustomerRepository.class);
//        System.out.println("Creating new Account");
//        customer.AddNewCustomer();
        System.out.println("Logging Into Account");
        customer.LogIn();
    }
}
