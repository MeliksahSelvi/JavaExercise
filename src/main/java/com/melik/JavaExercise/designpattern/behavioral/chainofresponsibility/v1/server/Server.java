package com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1.server;


import com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public boolean logIn(String email, String passoword) {
        if (middleware.check(email, passoword)) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        String correctPassword = users.get(email);
        return correctPassword.equals(password);
    }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
}
