package com.spring.DependencyInjection.myoffice;

import java.util.Scanner;

public class BackendDev implements Employee{

    private int EmpNo;
    private String name;

    Scanner sc = new Scanner(System.in);

    public BackendDev() {
        System.out.println("Enter Employee Number");
        this.EmpNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name");
        this.name = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Backend Dev-Member { Emp Number : "+ EmpNo +" , Name : "+name+" }";
    }
}
