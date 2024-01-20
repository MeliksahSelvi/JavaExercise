package com.melik.JavaExercise.designpattern.creational.factory.v1.button;

public class WindowsButton implements Button{

    @Override
    public void render() {
        System.out.println("Windows button rendered");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("WINDOWS BUTTON Clicked!");
    }
}
