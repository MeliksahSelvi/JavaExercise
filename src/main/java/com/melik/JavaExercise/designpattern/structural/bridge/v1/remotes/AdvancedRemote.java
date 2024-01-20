package com.melik.JavaExercise.designpattern.structural.bridge.v1.remotes;

import com.melik.JavaExercise.designpattern.structural.bridge.v1.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Advanced Remote : mute");
        device.setVolume(0);
    }
}
