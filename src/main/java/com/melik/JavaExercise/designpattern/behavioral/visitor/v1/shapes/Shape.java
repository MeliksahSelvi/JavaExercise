package com.melik.JavaExercise.designpattern.behavioral.visitor.v1.shapes;

import com.melik.JavaExercise.designpattern.behavioral.visitor.v1.visitors.Visitor;

public interface Shape {

    void move(int x,int y );
    void draw();
    String accept(Visitor visitor);
}
