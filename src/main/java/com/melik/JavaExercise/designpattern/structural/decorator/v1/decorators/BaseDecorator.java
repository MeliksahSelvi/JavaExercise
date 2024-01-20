package com.melik.JavaExercise.designpattern.structural.decorator.v1.decorators;

import com.melik.JavaExercise.designpattern.structural.decorator.v1.mail.Mail;

public abstract class BaseDecorator implements Mail {

    private Mail mail;

    public BaseDecorator(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void send() {
        mail.send();
    }
}
