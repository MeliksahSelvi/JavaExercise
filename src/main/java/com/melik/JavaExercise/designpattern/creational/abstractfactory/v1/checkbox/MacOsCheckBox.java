package com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.checkbox;

public class MacOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("you have created MacOs checkbox!");
    }
}
