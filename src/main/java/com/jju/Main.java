package com.jju;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PaymentMethod> payments = new ArrayList<>();

        payments.add(new CreditCard("4242-4242-4242-4242"));
        payments.add(new PayPal("martayilma229@gamil.com"));

        for (PaymentMethod payment : payments) {
            payment.processPayment(99.99);
        }
    }
}