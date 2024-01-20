package com.melik.JavaExercise.designpattern.structural.bridge.v1.remotes;

import com.melik.JavaExercise.designpattern.structural.bridge.v1.devices.Device;

public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote : power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote : Volume Up");
        int oldVolume = device.getVolume();
        device.setVolume(oldVolume + 10);
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote : Volume Down");
        int oldVolume = device.getVolume();
        device.setVolume(oldVolume - 10);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote : Channel Up");
        int oldChannel = device.getChannel();
        device.setChannel(oldChannel + 1);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote : Channel Down");
        int oldChannel = device.getChannel();
        device.setChannel(oldChannel - 1);
    }
}
