package com.melik.JavaExercise.designpattern.behavioral.mediator.v1.users;

import com.melik.JavaExercise.designpattern.behavioral.mediator.v1.mediators.ChatMediator;

public class UserImpl implements User {

    private ChatMediator chatMediator;
    private String name;

    public UserImpl(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending Message=" + message+"\n");
        this.chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Received Message:" + message+"\n");
    }
}
