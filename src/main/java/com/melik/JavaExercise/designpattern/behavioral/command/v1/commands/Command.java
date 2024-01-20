package com.melik.JavaExercise.designpattern.behavioral.command.v1.commands;


import com.melik.JavaExercise.designpattern.behavioral.command.v1.editor.Editor;

public abstract class Command {

    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
