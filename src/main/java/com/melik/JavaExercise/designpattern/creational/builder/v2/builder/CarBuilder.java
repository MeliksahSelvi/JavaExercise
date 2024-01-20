package com.melik.JavaExercise.designpattern.creational.builder.v2.builder;

import com.melik.JavaExercise.designpattern.creational.builder.v2.cars.Car;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.Engine;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.GpsNavigator;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.TripComputer;
import com.melik.JavaExercise.designpattern.creational.builder.v2.enums.CarType;
import com.melik.JavaExercise.designpattern.creational.builder.v2.enums.Transmission;

public class CarBuilder implements Builder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGpsNavigator(GpsNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult(){
        return new Car(carType,seats,engine,transmission,tripComputer,gpsNavigator);
    }
}
