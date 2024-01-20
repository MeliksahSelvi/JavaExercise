package com.melik.JavaExercise.designpattern.creational.builder.v2.builder;

import com.melik.JavaExercise.designpattern.creational.builder.v2.components.Engine;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.GpsNavigator;
import com.melik.JavaExercise.designpattern.creational.builder.v2.components.TripComputer;
import com.melik.JavaExercise.designpattern.creational.builder.v2.enums.CarType;
import com.melik.JavaExercise.designpattern.creational.builder.v2.enums.Transmission;

public interface Builder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GpsNavigator gpsNavigator);
}
