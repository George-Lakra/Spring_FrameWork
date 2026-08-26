package com.spring.orm.transaction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomerRepository {

    Scanner sc = new Scanner(System.in);
    @Autowired
    private BankService service;
    @PersistenceContext
    private EntityManager entityManager;
    public CustomerRepository(){

    }

    @Transactional
    public void AddNewCustomer(){
        Customer customer = new Customer();
        System.out.println("Enter you Account Number");
        customer.setAcNo(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter YOur Name");
        customer.setAccHolderName(sc.nextLine());
        entityManager.persist(customer);
    }

    @Transactional
    public void LogIn(){
        System.out.println("Enter the Account Number");
        int acNo =sc.nextInt();
        Customer person=entityManager.find(Customer.class,acNo);
        System.out.println("===== Select the operation to perform ====");
        System.out.println("1. Withdraw");
        System.out.println("2. Disposit");
        System.out.println("3. Transfer");
        System.out.println("Enter your Choice:");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter the amount to withdraw");
                int withdrawAmount=sc.nextInt();
                service.withdraw(person,withdrawAmount);
                break;
            case 2:
                System.out.println("Enter the amount to Deposit");
                int DepositAmount=sc.nextInt();
                service.Deposit(person,DepositAmount);
                break;
            case 3:
                System.out.println("Enter Others Persons AcNo to transfer");
                int tAcno=sc.nextInt();
                Customer transferPer=entityManager.find(Customer.class,tAcno);
                if(person==transferPer){
                    throw new RuntimeException();
                }
                System.out.println("Enter the Amount");
                int tranAmount=sc.nextInt();
                service.Transfer(person,transferPer,tranAmount);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
