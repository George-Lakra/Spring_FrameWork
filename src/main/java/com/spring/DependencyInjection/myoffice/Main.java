package com.spring.DependencyInjection.myoffice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("myoffice.xml");
        EmployeeRepository employee =
                application.getBean("employeeRepository",EmployeeRepository.class);

        employee.setEmployee(application.getBean("employee",Employee.class));

        /*Try without employee.setEmployee(____); still it will work
         *
         * reason : Spring will automatically call's the set employee method for us
         *
         * <property name="employee" ref="employee"/>
         *
         * Spring follows the JavaBean naming convention:
         * property "employee" → setEmployee()
         *
         * Therefore, for Setter Injection, we use a setter method such as
         * setEmployee() corresponding to the property name.
         *
         */

        employee.displayEmployee();
    }
}
