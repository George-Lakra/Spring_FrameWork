package com.spring.DependencyInjection.mycar;

public class ElectricalEngine implements Engine{

    public ElectricalEngine() {
        System.out.println("Car engine is switched to Electrical Engine");
        System.out.println("Car will use now Electricity");
    }

    @Override
    public void start() {
        System.out.println("Electrical Engine Started");
    }
}
