package com.melik.JavaExercise.designpattern.behavioral.chainofresponsibility.v1.middleware;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello admin");
            return true;
        }
        System.out.println("Hello User");
        return checkNext(email, password);
    }
}
