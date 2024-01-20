package com.melik.JavaExercise.designpattern.behavioral.command.v1.commands;


import com.melik.JavaExercise.designpattern.behavioral.command.v1.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipBoard = editor.textField.getSelectedText();
        return false;
    }
}
