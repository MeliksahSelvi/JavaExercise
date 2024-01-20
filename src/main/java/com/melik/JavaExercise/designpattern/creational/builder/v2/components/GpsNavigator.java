package com.melik.JavaExercise.designpattern.creational.builder.v2.components;

public class GpsNavigator {

    private String route;

    public GpsNavigator() {
        this.route = "Atatürk Mahallesi Erzincan Sokak No:28 Ataşehir/İstanbul";
    }

    public GpsNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
