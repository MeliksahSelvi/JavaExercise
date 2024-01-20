package com.melik.JavaExercise.designpattern.behavioral.state.v2.states;

public class TvStopState implements State{
    @Override
    public void doAction() {
        System.out.println("Tv is turned off");
    }
}
