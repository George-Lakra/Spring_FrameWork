package com.spring.aop;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Bank {
    private int AcNo;
    private String AcHolderName;
    private double balance;
    Scanner sc = new Scanner(System.in);
    public Bank() {
        System.out.println("Enter the Account No");
        AcNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Account holder name");
        AcHolderName = sc.nextLine();
        this.balance=12000.90;
    }

    public int getAcNo(){
        return AcNo;
    }

    public  String getAcHolderName(){
        return AcHolderName;
    }

    public void setBalance(double balance) {
        this.balance =balance;
    }

    public double getBalance() {
        return balance;
    }
}
