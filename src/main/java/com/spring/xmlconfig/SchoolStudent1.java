package com.spring.xmlconfig;

import java.util.Scanner;

public class SchoolStudent1 implements Student{
    Scanner sc = new Scanner(System.in);
    private int roll;
    private String name;

    public SchoolStudent1() {
        System.out.println("Enter your Roll No");
        this.roll =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        this.name = sc.nextLine();
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
