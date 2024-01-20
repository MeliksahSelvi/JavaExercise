package com.melik.JavaExercise.designpattern.creational.factory.v1.factories;

import com.melik.JavaExercise.designpattern.creational.factory.v1.button.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button okbutton=createButton();
        okbutton.render();
    }

    public abstract Button createButton();
}
