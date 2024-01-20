package com.melik.JavaExercise.designpattern.behavioral.state.v2.context;

import com.melik.JavaExercise.designpattern.behavioral.state.v2.states.State;

public class TvContext implements State {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
