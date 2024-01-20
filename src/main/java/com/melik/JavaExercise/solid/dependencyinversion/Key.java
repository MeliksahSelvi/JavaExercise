package com.melik.JavaExercise.solid.dependencyinversion;

public class Key {

    private Runnable runnable;

    public Key(Runnable runnable) {
        this.runnable = runnable;
    }

    public void turnKey(){
        runnable.run();
    }
}
