package com.melik.JavaExercise.designpattern.behavioral.command.v1.commands;


import com.melik.JavaExercise.designpattern.behavioral.command.v1.editor.Editor;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipBoard == null || editor.clipBoard.isEmpty()) {
            return false;
        }

        backup();
        editor.textField.insert(editor.clipBoard, editor.textField.getCaretPosition());
        return true;
    }
}
