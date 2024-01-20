package com.melik.JavaExercise.designpattern.behavioral.memento.v1.history;

import com.melik.JavaExercise.designpattern.behavioral.memento.v1.editor.Editor;

public class Memento {

    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
