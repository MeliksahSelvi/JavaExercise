package com.melik.JavaExercise.solid.interfacesegragation.suitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

public class Fox implements Livable{
    @Override
    public void live() {
        System.out.println(getClass().getSimpleName()+" is live");
    }
}
