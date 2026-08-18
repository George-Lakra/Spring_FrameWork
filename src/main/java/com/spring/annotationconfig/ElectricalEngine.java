package com.spring.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class ElectricalEngine implements Engine{
    public ElectricalEngine() {
        System.out.println("Switched to Electrical Engine");
    }

    @Override
    public void start() {
        System.out.println("Electrical engine started");
    }
}
