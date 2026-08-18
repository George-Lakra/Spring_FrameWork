package com.spring.annotationconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // @Component specify this class is registered to become bean
@Primary //@Primary annotation is used to set default bean when there are two or more bean ;
public class PetrolEngine implements Engine{
    public PetrolEngine() {
        System.out.println("Switched to Petrol Engine");
    }

    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}
