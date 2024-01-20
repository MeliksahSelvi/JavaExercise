package com.melik.JavaExercise.solid.dependencyinversion;

public abstract class Car implements Runnable {

    private boolean isActive;
    private String carType;

    protected Car(String carType) {
        this.carType = carType;
    }


    private void enabled() {
        System.out.println("Engine Active");
        isActive = true;
    }

    private void disabled() {
        System.out.println("Engine Passive");
        isActive = false;
    }

    @Override
    public void run() {
        System.out.print(carType);
        if (isActive) {
            disabled();
        } else {
            enabled();
        }
    }

}
