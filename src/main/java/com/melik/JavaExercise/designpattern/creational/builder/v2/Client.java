package com.melik.JavaExercise.designpattern.creational.builder.v2;

import com.melik.JavaExercise.designpattern.creational.builder.v2.builder.CarBuilder;
import com.melik.JavaExercise.designpattern.creational.builder.v2.builder.CarManualBuilder;
import com.melik.JavaExercise.designpattern.creational.builder.v2.cars.Car;
import com.melik.JavaExercise.designpattern.creational.builder.v2.cars.Manual;
import com.melik.JavaExercise.designpattern.creational.builder.v2.director.Director;

public class Client {
    public static void main(String[] args) {

        Director director=new Director();

        CarBuilder builder=new CarBuilder();
        director.constructSportsCar(builder);

        Car car=builder.getResult();
        System.out.println("Car built:\n"+car.getCarType());

        CarManualBuilder manualBuilder=new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar Manual built:\n"+carManual.print());
    }
}
