package com.melik.JavaExercise.designpattern.behavioral.template.v2.developer;

public abstract class Programmer {

    public final void doIt() {
        writesCode();
        writesTest();
        if (hasReView()) {
            codeReview();
        }
    }

    protected abstract void writesCode();

    protected void writesTest() {
        System.out.println("Programmer write UnitTest,Integration Test");
    }

    protected boolean hasReView(){
        return true;
    }

    protected void codeReview(){
        System.out.println("Programmer does a code review");
    }
}
