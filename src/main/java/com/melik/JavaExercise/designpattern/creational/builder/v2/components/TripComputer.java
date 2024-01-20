package com.melik.JavaExercise.designpattern.creational.builder.v2.components;

import com.melik.JavaExercise.designpattern.creational.builder.v2.cars.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus(){
        Engine engine = this.car.getEngine();
        if (engine.isStarted()) {
            System.out.println("Car is started");
        }else {
            System.out.println("Car isn't started");
        }
    }
}
