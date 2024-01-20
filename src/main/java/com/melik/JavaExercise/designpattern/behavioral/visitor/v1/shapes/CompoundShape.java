package com.melik.JavaExercise.designpattern.behavioral.visitor.v1.shapes;

import com.melik.JavaExercise.designpattern.behavioral.visitor.v1.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {

    private int id;
    public List<Shape> shapeList = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        //move shape
    }

    @Override
    public void draw() {
        //draw shape
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getId() {
        return id;
    }

    public void add(Shape shape) {
        shapeList.add(shape);
    }
}
