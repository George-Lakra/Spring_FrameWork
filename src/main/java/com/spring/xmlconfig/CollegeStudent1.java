package com.spring.xmlconfig;

import java.util.Scanner;

public class CollegeStudent1 implements Student{
    private int roll;
    private String name;
    Scanner sc = new Scanner(System.in);

    public CollegeStudent1() {
        System.out.println("Enter your Roll No");
        this.roll =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        this.name = sc.nextLine();
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
