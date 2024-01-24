package com.melik.JavaExercise.core.version.java8.method.reference;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public interface Animal {

    void sound();

    default void live(){
        System.out.println("Animal lives");
    }
}
