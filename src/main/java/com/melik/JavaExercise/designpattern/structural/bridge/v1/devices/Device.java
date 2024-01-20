package com.melik.JavaExercise.designpattern.structural.bridge.v1.devices;

public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
