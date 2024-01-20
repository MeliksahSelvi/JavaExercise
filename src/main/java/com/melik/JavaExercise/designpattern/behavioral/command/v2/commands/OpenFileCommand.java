package com.melik.JavaExercise.designpattern.behavioral.command.v2.commands;


import com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver.FileSystemReceiver;

public class OpenFileCommand extends BaseCommand{

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        super(fileSystemReceiver);
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
