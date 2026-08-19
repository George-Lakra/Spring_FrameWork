package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(Application.class);
        BankService sbi = app.getBean("bankService",BankService.class);
        //you can use switch case to make programing more dynamic
        sbi.deposit(100);
        sbi.showBalance();
        sbi.withdraw(197);
        sbi.showBalance();
    }
}
