package com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
