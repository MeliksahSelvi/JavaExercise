package com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.factories;

import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.button.Button;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.button.WindowsButton;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.checkbox.CheckBox;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
