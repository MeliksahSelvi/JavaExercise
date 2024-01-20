package com.melik.JavaExercise.designpattern.structural.decorator.v1.decorators;

import com.melik.JavaExercise.designpattern.structural.decorator.v1.mail.Mail;

public class EncodeDecorator extends BaseDecorator {
    public EncodeDecorator(Mail mail) {
        super(mail);
    }

    @Override
    public void send() {
        super.send();
        System.out.println(" hem de encoded olarak");
    }
}
