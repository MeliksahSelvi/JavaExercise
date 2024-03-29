package com.melik.JavaExercise.designpattern.creational.builder.v2.cars;

import com.melik.JavaExercise.designpattern.creational.builder.v2.components.Engine;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.GpsNavigator;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.TripComputer;
import com.melik.JavaExercise.designpattern.creational.builder.v2.enums.CarType;
import com.melik.JavaExercise.designpattern.creational.builder.v2.enums.Transmission;

public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GpsNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }


    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GpsNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }
}
