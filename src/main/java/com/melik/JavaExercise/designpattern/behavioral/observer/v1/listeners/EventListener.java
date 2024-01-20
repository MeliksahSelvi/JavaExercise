package com.melik.JavaExercise.designpattern.behavioral.observer.v1.listeners;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);
}
