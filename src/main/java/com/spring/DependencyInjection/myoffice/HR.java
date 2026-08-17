package com.spring.DependencyInjection.myoffice;

import java.util.Scanner;

public class HR implements Employee{
    private int EmpNo;
    private String name;
    Scanner sc = new Scanner(System.in);
    public HR() {
        System.out.println("Enter Employee Number");
        EmpNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name");
        name = sc.nextLine();
    }

    @Override
    public String toString() {
        return "HR-Member { Emp Number : "+ EmpNo +" , Name : "+name+" }";
    }
}
