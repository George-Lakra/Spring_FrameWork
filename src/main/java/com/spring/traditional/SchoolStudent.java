package com.spring.traditional;

public class SchoolStudent implements Student{
    private int roll;
    private String name;

    public SchoolStudent(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
