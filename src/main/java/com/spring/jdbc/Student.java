package com.spring.jdbc;

import org.springframework.stereotype.Repository;

@Repository
public class Student {
    private int rollNo;
    private String name;
    private int Class;

    public Student(int rollNo, String name,int Class) {
        this.rollNo = rollNo;
        this.name = name;
        this.Class=Class;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", class=' "+Class+
                '}';
    }
}
