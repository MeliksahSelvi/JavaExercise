package com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.factories;

import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.button.Button;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.button.MacOsButton;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.checkbox.CheckBox;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.checkbox.MacOsCheckBox;

public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
