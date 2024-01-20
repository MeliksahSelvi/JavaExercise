package com.melik.JavaExercise.designpattern.behavioral.command.v2.invoker;


import com.melik.JavaExercise.designpattern.behavioral.command.v2.commands.Command;

public class FileInvoker {

    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
