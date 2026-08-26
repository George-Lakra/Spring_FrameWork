package com.spring.orm.transaction;

public class BankService {
    void withdraw(Customer person,int amount){
        if(amount>person.getBalance() || amount<=0){
            throw new RuntimeException();
        }
        double balance=person.getBalance();
        balance-=amount;
        person.setBalance(balance);
    }
    void Deposit(Customer person,int amount){
        double balance= person.getBalance();
        balance+=amount;
        person.setBalance(balance);
    }
    void Transfer(Customer person,Customer transferPer,int amount){
        if(amount> person.getBalance()){
            throw new RuntimeException();
        }
        person.setBalance(person.getBalance()-amount);
        transferPer.setBalance(transferPer.getBalance()+amount);
    }
}
