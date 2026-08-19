package com.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    private Bank sbi;
    private double balance;

    @Autowired
    public BankService(Bank sbi) {
        this.sbi = sbi;
        this.balance=sbi.getBalance();
    }
    public void deposit(double amount){
        balance+=amount;
        sbi.setBalance(balance);
        System.out.println(amount+" Deposited successfully ");
    }
    public void withdraw(double amount){
        balance-=amount;
        sbi.setBalance(balance);
        System.out.println("Successfully withdrawn " +amount);
    }
    public void showBalance(){
        System.out.println(sbi.getBalance());
    }
}
