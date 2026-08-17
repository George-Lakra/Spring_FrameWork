package com.spring.DependencyInjection.mycar;

public class PetrolEngine implements Engine{

    public PetrolEngine(){
        System.out.println("Car engine is switched to Petrol Engine");
        System.out.println("Car will now use petrol");
    }

    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}
