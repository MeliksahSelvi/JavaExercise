package com.melik.JavaExercise.designpattern.behavioral.strategy.v1.strategies;

import com.melik.JavaExercise.designpattern.behavioral.strategy.v1.creditcard.CreditCard;

import java.util.Scanner;

public class PayByCreditCard implements PayStrategy {

    private static Scanner scanner = new Scanner(System.in);
    private CreditCard card;

    /**
     * Collect credit card data.
     */
    @Override
    public void collectPaymentDetails() {
        System.out.print("Enter the card number: ");
        String number = scanner.nextLine();
        System.out.print("Enter the card expiration date 'mm/yy': ");
        String date = scanner.nextLine();
        System.out.print("Enter the CVV code: ");
        String cvv = scanner.nextLine();
        card = new CreditCard(number, date, cvv);

        // Validate credit card number...
    }

    /**
     * After card validation we can charge customer's credit card.
     */
    @Override
    public boolean pay(double paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }

}
