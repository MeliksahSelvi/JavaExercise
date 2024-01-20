package com.melik.JavaExercise.designpattern.behavioral.visitor.v1.visitors;

import com.melik.JavaExercise.designpattern.behavioral.visitor.v1.shapes.Circle;
import com.melik.JavaExercise.designpattern.behavioral.visitor.v1.shapes.CompoundShape;
import com.melik.JavaExercise.designpattern.behavioral.visitor.v1.shapes.Dot;
import com.melik.JavaExercise.designpattern.behavioral.visitor.v1.shapes.Rectangle;

public interface Visitor {

    String visit(Dot dot);

    String visit(Circle circle);

    String visit(Rectangle rectangle);

    String visit(CompoundShape compoundShape);
}
