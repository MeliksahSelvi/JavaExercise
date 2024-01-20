package com.melik.JavaExercise.designpattern.behavioral.state.v1.ui;

import com.melik.JavaExercise.designpattern.behavioral.state.v1.states.ReadyState;
import com.melik.JavaExercise.designpattern.behavioral.state.v1.states.State;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private State state;
    private boolean playing;
    private List<String> playList = new ArrayList<>();
    private int currentTrack;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);
        for (int i = 0; i < 12; i++) {
            playList.add("Tracking " + i);
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public String startPlayback() {
        return "Playing " + playList.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;

        if (currentTrack == playList.size()) {
            currentTrack = 0;
        }
        return playList.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;

        if (currentTrack < 0) {
            currentTrack = playList.size() - 1;
        }
        return playList.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        currentTrack = 0;
    }

}
