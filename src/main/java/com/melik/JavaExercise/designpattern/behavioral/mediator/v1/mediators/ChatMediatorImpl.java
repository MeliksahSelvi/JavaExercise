package com.melik.JavaExercise.designpattern.behavioral.mediator.v1.mediators;

import com.melik.JavaExercise.designpattern.behavioral.mediator.v1.users.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> userList;

    public ChatMediatorImpl() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User userReceive : this.userList) {
            if (userReceive != user) {
                userReceive.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}
