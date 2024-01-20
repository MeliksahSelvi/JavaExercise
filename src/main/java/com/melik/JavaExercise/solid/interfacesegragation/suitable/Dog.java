package com.melik.JavaExercise.solid.interfacesegragation.suitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

public class Dog implements Barkable{

    @Override
    public void live() {
        System.out.println(getClass().getSimpleName()+" is live");
    }

    @Override
    public void bark() {
        System.out.println(getClass().getSimpleName()+" is bark");
    }
}
