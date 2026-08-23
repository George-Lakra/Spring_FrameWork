package com.spring.project.worker;

public class worker {
    private int eno;
    private String name ;
    private String roll;

    public worker(int eno, String name, String roll) {
        this.eno = eno;
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "worker{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }

    public int getEno() {
        return eno;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }
}
