package com.melik.JavaExercise.designpattern.behavioral.observer.v1.editor;

import com.melik.JavaExercise.designpattern.behavioral.observer.v1.publisher.EventManager;

import java.io.File;

public class Editor {

    public EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager=new EventManager("open","save");
    }

    public void openFile(String filePath){
        this.file=new File(filePath);
        eventManager.notify("open",file);
    }

    public void saveFile(){
        if (this.file!=null){
            eventManager.notify("save",file);
        }else {
            throw new RuntimeException("Please open a file first");
        }
    }
}
