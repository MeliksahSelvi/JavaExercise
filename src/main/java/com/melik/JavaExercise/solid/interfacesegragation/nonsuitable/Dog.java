package com.melik.JavaExercise.solid.interfacesegragation.nonsuitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

public class Dog implements Animal{
    @Override
    public void fly() {
        //do nothing
    }

    @Override
    public void live() {
        System.out.println(getClass().getSimpleName()+" is live");
    }

    @Override
    public void bark() {
        System.out.println(getClass().getSimpleName()+" is bark");
    }
}
