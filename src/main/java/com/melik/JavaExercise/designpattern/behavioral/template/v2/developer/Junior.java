package com.melik.JavaExercise.designpattern.behavioral.template.v2.developer;

public class Junior extends Programmer {
    @Override
    protected void writesCode() {
        System.out.println("Junior writes code");
    }

    @Override
    protected boolean hasReView() {
        return false;
    }
}
