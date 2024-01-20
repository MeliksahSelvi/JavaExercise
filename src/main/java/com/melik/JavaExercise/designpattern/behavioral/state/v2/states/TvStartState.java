package com.melik.JavaExercise.designpattern.behavioral.state.v2.states;

public class TvStartState implements State{
    @Override
    public void doAction() {
        System.out.println("Tv is turned On");
    }
}
