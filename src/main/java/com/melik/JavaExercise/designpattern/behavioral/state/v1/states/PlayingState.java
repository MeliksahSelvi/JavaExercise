package com.melik.JavaExercise.designpattern.behavioral.state.v1.states;

import com.melik.JavaExercise.designpattern.behavioral.state.v1.ui.Player;

public class PlayingState extends State{
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop Playing";
    }

    @Override
    public String onPlay() {
        player.setState(new ReadyState(player));
        return "Paused";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
