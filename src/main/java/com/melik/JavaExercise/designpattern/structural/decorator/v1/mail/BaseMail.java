package com.melik.JavaExercise.designpattern.structural.decorator.v1.mail;

public class BaseMail implements Mail {

    private String sendFrom;
    private String sendTo;

    public BaseMail(String sendFrom, String sendTo) {
        this.sendFrom = sendFrom;
        this.sendTo = sendTo;
    }

    @Override
    public void send() {
        System.out.println(sendFrom + "'dan " + sendTo + " 'a mail gönderildi.");
    }
}
