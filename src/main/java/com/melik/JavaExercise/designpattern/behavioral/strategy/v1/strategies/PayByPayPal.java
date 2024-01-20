package com.melik.JavaExercise.designpattern.behavioral.strategy.v1.strategies;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PayByPayPal implements PayStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("meliksah.selvi2834@gmail.com", "melik123");
        DATA_BASE.put("mselvi@uni-yaz.com", "uniyaz123");
    }

    @Override
    public void collectPaymentDetails() {
        while (!signedIn) {
            System.out.println("Enter email");
            email = scanner.nextLine();
            System.out.println("Input password");
            password = scanner.nextLine();
            boolean isVerify = verify();
            if (isVerify) {
                System.out.println("Data verification has been successful.");
            } else {
                System.out.println("Wrong email or password!");
            }
        }
    }

    private boolean verify() {
        boolean isVerify = email.equals(DATA_BASE.get(password));
        setSignedIn(isVerify);
        return isVerify;
    }

    @Override
    public boolean pay(double paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
