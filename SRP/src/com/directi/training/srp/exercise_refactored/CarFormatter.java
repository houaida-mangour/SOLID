package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarFormatter {
    public String formatCarNames(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
        }
        if (sb.length() > 2) {
            return sb.substring(0, sb.length() - 2);
        }
        return "";
    }
}