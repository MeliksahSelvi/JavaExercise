package com.melik.JavaExercise.designpattern.structural.proxy.v1.video;

public class Video {

    private String id;
    private String title;
    private String data;

    public Video(String id, String title, String data) {
        this.id = id;
        this.title = title;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
