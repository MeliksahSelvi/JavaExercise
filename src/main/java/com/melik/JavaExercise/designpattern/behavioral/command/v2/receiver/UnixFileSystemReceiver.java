package com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver;

public class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Unix System Open File");
    }

    @Override
    public void writeFile() {
        System.out.println("Unix System Write File");
    }

    @Override
    public void closeFile() {
        System.out.println("Unix System Close File");
    }
}
