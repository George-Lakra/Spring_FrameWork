package com.spring.orm.transaction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Bank")
public class Customer {
    @Id
    private int acNo;
    @Column(name = "name")
    private String accHolderName;
    private double Balance;

    public Customer(){

    }

    public Customer(int acNo, String accHolderName) {
        this.acNo = acNo;
        this.accHolderName = accHolderName;

    }

    public int getAcNo() {
        return acNo;
    }

    public String  getAccHolderName() {
        return accHolderName;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setAcNo(int acNo) {
        this.acNo = acNo;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
}
