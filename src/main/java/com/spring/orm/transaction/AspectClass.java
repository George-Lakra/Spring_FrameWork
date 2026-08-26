package com.spring.orm.transaction;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
    @Before("execution(* com.spring.orm.transaction.CustomerRepository.AddNewCustomer(..))")
    public void loggIn(){
        System.out.println("Creating....");
    }

    @After("  execution(* com.spring.orm.transaction.BankService.withdraw(..)) || " +
            " execution(* com.spring.orm.transaction.BankService.Deposit(..)) || " +
            " execution(* com.spring.orm.transaction.BankService.Transfer(..))")
    public void exit(){
        System.out.println(" Exiting ");
    }
}
