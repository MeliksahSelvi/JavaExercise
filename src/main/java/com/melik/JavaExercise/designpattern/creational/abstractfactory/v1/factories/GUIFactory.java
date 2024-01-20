package com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.factories;

import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.button.Button;
import com.melik.JavaExercise.designpattern.creational.abstractfactory.v1.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
