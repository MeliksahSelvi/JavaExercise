package com.melik.JavaExercise.designpattern.creational.factory.v1.button;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Html button rendered");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("HTML BUTTON CLicked!");
    }
}
