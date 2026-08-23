package com.spring.orm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int Eno;
    private String name;
    public Employee(){
    }

    public Employee(int eno, String name) {
        Eno = eno;
        this.name = name;
    }

    public int getEno() {
        return Eno;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Eno=" + Eno +
                ", name='" + name + '\'' +
                '}';
    }
}
