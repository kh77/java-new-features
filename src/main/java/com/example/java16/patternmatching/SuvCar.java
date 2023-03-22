package com.example.java16.patternmatching;

public class SuvCar implements Car {

    @Override
    public String getName() {
        return "Suv Car";
    }

    @Override
    public Long getPrice() {
        return 1000000L;
    }
}
