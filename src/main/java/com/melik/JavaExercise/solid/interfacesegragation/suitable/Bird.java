package com.melik.JavaExercise.solid.interfacesegragation.suitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is fly");
    }

    @Override
    public void live() {
        System.out.println(getClass().getSimpleName()+" is live");
    }
}
