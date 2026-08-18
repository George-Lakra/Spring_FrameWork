package com.spring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //@Component specify that this class applicable to become bean.
public class Bike {
    private Engine engine;


    @Autowired //@Autowired annotation automatically inject the dependency it can be used with field , setter and constructor
    //@Qualifier is used when there are 2 or more bean available ie.ElectricEngine and PetrolEngine
    //@Qualifier specify which bean to use .
    public Bike(@Qualifier("electricalEngine") Engine engine) {
        this.engine = engine;
    }
    public void start(){
        System.out.println("Starting..");
        engine.start();
        System.out.println("Riding a Bike");
    }
}
