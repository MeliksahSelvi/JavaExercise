package com.melik.JavaExercise.designpattern.behavioral.state.v1.states;

import com.melik.JavaExercise.designpattern.behavioral.state.v1.ui.Player;

public class LockedState extends State {
    public LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.setState(new ReadyState(player));
            return "Stop Playing";
        }
        return "Locked...";
    }

    @Override
    public String onPlay() {
        player.setState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
