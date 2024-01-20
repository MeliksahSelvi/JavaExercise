package com.melik.JavaExercise.designpattern.creational.factory.v1.factories;

import com.melik.JavaExercise.designpattern.creational.factory.v1.button.Button;
import com.melik.JavaExercise.designpattern.creational.factory.v1.button.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
