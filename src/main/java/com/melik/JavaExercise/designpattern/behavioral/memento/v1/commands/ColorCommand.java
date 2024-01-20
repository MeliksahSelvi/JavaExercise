package com.melik.JavaExercise.designpattern.behavioral.memento.v1.commands;

import com.melik.JavaExercise.designpattern.behavioral.memento.v1.editor.Editor;
import com.melik.JavaExercise.designpattern.behavioral.memento.v1.shapes.Shape;

import java.awt.*;


public class ColorCommand implements Command{

    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child:editor.getShapes().getSelected()){
            child.setColor(color);
        }
    }
}
