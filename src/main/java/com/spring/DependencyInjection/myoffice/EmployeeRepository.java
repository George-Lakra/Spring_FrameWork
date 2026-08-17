package com.spring.DependencyInjection.myoffice;

public class EmployeeRepository {

    private Employee employee;

    // Method name should always start with set____ because it is predefined by Spring Container
    public void setEmployee(Employee employee){
        this.employee=employee;
    }

    public void displayEmployee(){
        System.out.println(employee.toString());
    }
}
