package com.melik.JavaExercise.designpattern.behavioral.command.v2.commands;


import com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver.FileSystemReceiver;

public class WriteFileCommand extends BaseCommand {
    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        super(fileSystemReceiver);
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
