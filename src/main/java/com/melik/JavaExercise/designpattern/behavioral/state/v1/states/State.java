package com.melik.JavaExercise.designpattern.behavioral.state.v1.states;

import com.melik.JavaExercise.designpattern.behavioral.state.v1.ui.Player;

public abstract class State {

    protected Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
