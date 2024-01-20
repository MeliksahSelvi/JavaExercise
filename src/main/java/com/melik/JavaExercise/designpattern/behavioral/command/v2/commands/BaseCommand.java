package com.melik.JavaExercise.designpattern.behavioral.command.v2.commands;


import com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver.FileSystemReceiver;

public abstract class BaseCommand implements Command{

    protected FileSystemReceiver fileSystemReceiver;

    public BaseCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

}
