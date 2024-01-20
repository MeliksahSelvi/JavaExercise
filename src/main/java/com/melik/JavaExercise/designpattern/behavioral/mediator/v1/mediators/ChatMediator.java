package com.melik.JavaExercise.designpattern.behavioral.mediator.v1.mediators;

import com.melik.JavaExercise.designpattern.behavioral.mediator.v1.users.User;

public interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);
}
