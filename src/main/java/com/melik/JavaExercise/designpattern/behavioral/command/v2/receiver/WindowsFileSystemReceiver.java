package com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Windows System Open File");
    }

    @Override
    public void writeFile() {
        System.out.println("Windows System Write File");
    }

    @Override
    public void closeFile() {
        System.out.println("Windows System Close File");
    }
}
