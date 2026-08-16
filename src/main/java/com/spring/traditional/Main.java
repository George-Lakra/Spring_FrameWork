package com.spring.traditional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ROll Number");
        int roll = sc.nextInt();;
        sc.nextLine();
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        Student student  = new SchoolStudent(roll,name);

        /*The new keyword makes the Code tightly coupled to SchoolStudent
         * now how do we say it tightly coupled ?
         * Because our main  know that the implementation is StudentSchool .
         * now if we want CollegeStudent we have to again change the main
         *
         * Student student = new CollegeStudent(roll, name);
         * Therefore, Main is tightly coupled to SchoolStudent.
         *
         * */

        System.out.println(student.toString());
    }
}
