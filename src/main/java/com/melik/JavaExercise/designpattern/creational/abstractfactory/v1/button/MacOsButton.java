package com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.button;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("you have created MacOs Button!");
    }
}
