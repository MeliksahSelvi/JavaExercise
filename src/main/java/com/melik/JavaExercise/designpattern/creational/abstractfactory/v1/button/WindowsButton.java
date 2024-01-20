package com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created Windows button!");
    }
}
