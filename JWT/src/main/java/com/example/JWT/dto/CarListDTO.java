package com.example.JWT.dto;

import java.util.List;

import com.example.JWT.domain.Car;

public class CarListDTO {

    private List<Car> cars;

    public CarListDTO() {}

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}

