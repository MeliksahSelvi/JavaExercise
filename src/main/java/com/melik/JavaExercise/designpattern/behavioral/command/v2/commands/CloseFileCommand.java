package com.melik.JavaExercise.designpattern.behavioral.command.v2.commands;


import com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver.FileSystemReceiver;

public class CloseFileCommand extends BaseCommand {
    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        super(fileSystemReceiver);
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
