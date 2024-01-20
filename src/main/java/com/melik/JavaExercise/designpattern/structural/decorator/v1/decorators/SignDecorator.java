package com.melik.JavaExercise.designpattern.structural.decorator.v1.decorators;

import com.melik.JavaExercise.designpattern.structural.decorator.v1.mail.Mail;

public class SignDecorator extends BaseDecorator {

    private String signWho;

    public SignDecorator(Mail mail, String signWho) {
        super(mail);
        this.signWho = signWho;
    }

    @Override
    public void send() {
        super.send();
        System.out.println(" Signed by " + signWho);
    }
}
