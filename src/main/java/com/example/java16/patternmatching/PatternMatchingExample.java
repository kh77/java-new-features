package com.example.java16.patternmatching;

import java.util.ArrayList;
import java.util.List;

public class PatternMatchingExample {

    public static void main(String[] args) {
        var carList = new ArrayList<Car>();
        carList.add(new BmwCar());
        carList.add(new SuvCar());
        System.out.println(extractData(carList));
    }

    public static String extractData(List<Car> cars) {
        var stringBuilder = new StringBuilder();

        for (Car car : cars) {
            if (car instanceof BmwCar bmwCar) {
                stringBuilder.append("\n").append(bmwCar.getName()).append(" ").append(bmwCar.getPrice());
            } else if (car instanceof SuvCar suvCar) {
                stringBuilder.append("\n").append(suvCar.getName()).append(" ").append(suvCar.getPrice());
            }
        }
        return stringBuilder.toString();
    }
}
