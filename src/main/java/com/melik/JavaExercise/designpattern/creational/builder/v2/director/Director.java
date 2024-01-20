package com.melik.JavaExercise.designpattern.creational.builder.v2.director;

import com.melik.JavaExercise.designpattern.creational.builder.v2.builder.Builder;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.Engine;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.GpsNavigator;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.TripComputer;
import com.melik.JavaExercise.designpattern.creational.builder.v2.enums.CarType;
import com.melik.JavaExercise.designpattern.creational.builder.v2.enums.Transmission;

public class Director {

    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGpsNavigator(new GpsNavigator());
        builder.setTripComputer(new TripComputer());
    }

    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2,0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGpsNavigator(new GpsNavigator());
        builder.setTripComputer(new TripComputer());
    }

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5,0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(new GpsNavigator());
    }
}
