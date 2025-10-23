package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class CarRepository {
    private final List<Car> cars = Arrays.asList(
        new Car("1", "Golf III", "Volkswagen"),
        new Car("2", "Multipla", "Fiat"),
        new Car("3", "Megane", "Renault")
    );

    public Car findById(String id) {
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllCars() {
        return cars;
    }
}