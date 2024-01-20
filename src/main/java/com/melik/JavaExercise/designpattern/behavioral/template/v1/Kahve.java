package com.melik.JavaExercise.designpattern.behavioral.template.v1;

public class Kahve extends Demle{

    @Override
    protected void demle() {
        System.out.println("V60 ile demleniyor ");
    }

    @Override
    protected void ekIslem() {
        System.out.println("Süt Ekleniyor");
    }
}
