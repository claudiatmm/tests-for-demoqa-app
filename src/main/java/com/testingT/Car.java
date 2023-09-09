package com.testingT;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car() {
        System.out.println("Car instantiated");
    }

    public void getCar() {
        System.out.println("Toyota car");
    }
}
