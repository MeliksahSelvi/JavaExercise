package com.melik.JavaExercise.designpattern.behavioral.strategy.v1;

import com.melik.JavaExercise.designpattern.behavioral.strategy.v1.order.Order;
import com.melik.JavaExercise.designpattern.behavioral.strategy.v1.strategies.PayByCreditCard;
import com.melik.JavaExercise.designpattern.behavioral.strategy.v1.strategies.PayByPayPal;
import com.melik.JavaExercise.designpattern.behavioral.strategy.v1.strategies.PayStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* Bir ürün satın alırken farklı ödeme yöntemleri kullanılmak istenilebilir. Ödeme yöntemi runtime'da değiştirilmek istenebilir.
* İleride başka ödeme yöntemi gelebileceği düşünüldüğünde open-closed principle'ye uymamız gerekir.Aynı zamanda ödeme yöntemlerinin ayrıntılarını
* Client'tan gizlememiz gerekir. Bu durumda Strategy design pattern'ını kullanmayı seçtik. Bu ödeme yöntemlerinin her birerini aynı interfaceden türeyen
* concrete class'lara dönüştürüyoruz.Bu yaptıklarımızla client'ı bilmeyek istemeyeceği detaylarla uğraşmaktan korumuş oluyoruz. Ayrıca yeni ödeme yöntemi eklemek
* istediğimizde tek yapmamız gereken PayStrategy interfacesini implement eden bir concrete class oluşturmak.
* */
public class Client {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args)  {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(scanner.nextLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(scanner.nextLine());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = scanner.nextLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");
                String paymentMethod = scanner.nextLine();

                // Client creates different strategies based on input from user,
                // application configuration, etc.
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            // Order object delegates gathering payment data to strategy object,
            // since only strategies know what data they need to process a
            // payment.
            order.processOrder(strategy);

            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = scanner.nextLine();
            if (proceed.equalsIgnoreCase("P")) {
                // Finally, strategy handles the payment.
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
    }
}
