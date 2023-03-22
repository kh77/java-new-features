package com.example.java16.patternmatching;

public class BmwCar implements Car{

    @Override
    public String getName() {
        return "Bmw Car";
    }

    @Override
    public Long getPrice() {
        return 200000L;
    }
}
