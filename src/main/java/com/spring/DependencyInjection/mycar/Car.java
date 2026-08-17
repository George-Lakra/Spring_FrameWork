package com.spring.DependencyInjection.mycar;

public class Car {
    private Engine engine;

    /*
    * This Type of Dependency is Known as Constructor Injection.
    * */

    public Car(Engine engine){
        this.engine = engine;
    }



    public void Start(){
        System.out.println("Starting.....");
        engine.start();
        System.out.println("Car is now moving");
    }
}
