package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
    /* Advice are only method executable
    *  now what it means ? in execution @Before("execution (* com.spring.aop.BankService.deposit(..))")
    * The deposit is method not constructor  ,
    * BankService in Class and rest is package ,
    * and '*' represent any return type
    *
    * so based on the methods declared , it executes only for that method only
    * we can also use com.spring.aop.BankService..(..) : which means for all method except constructor it will execute for
    *
    * */
    @Before("execution (* com.spring.aop.BankService.deposit(..))")
    public void login(){
        System.out.println("Logging  into User's account ");
    }
    @After("execution(* com.spring.aop.BankService.*(..)) && ! execution(* com.spring.aop.BankService.showBalance(..))")
    public void successfulTransaction(){
        System.out.println("The transection was successfull");
    }
    //there are few more annotation like @AfterReturning , @AfterThrowing , @Around and @Pointcut
}
