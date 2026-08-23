package com.spring.orm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        EntityManagerFactory Factory = app.getBean(EntityManagerFactory.class);
        EntityManager entityManager = Factory.createEntityManager();
        System.out.println(entityManager);
        Employee employee1 = new Employee(101,"George");
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        //entityManager.persist(employee1);
        Employee employee = entityManager.find(Employee.class,101);
        entityManager.remove(employee);
        transaction.commit();

        System.out.println(employee);
        System.out.println("Operation performed Successful");
    }
}
