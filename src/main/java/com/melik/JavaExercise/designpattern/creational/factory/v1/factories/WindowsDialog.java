package com.melik.JavaExercise.designpattern.creational.factory.v1.factories;

import com.melik.JavaExercise.designpattern.creational.factory.v1.button.Button;
import com.melik.JavaExercise.designpattern.creational.factory.v1.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
