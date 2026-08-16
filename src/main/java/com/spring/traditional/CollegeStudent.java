package com.spring.traditional;

public class CollegeStudent implements Student{
    private int roll;
    private String name;

    public CollegeStudent(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
