package com.spring.DependencyInjection.mycar;

public class DieselEngine implements Engine{

    public DieselEngine() {
        System.out.println("Car engine is switched to Diesel Engine");
        System.out.println("Car will now use Diesel");
    }

    @Override
    public void start() {
        System.out.println("Diesel Engine started");
    }
}
