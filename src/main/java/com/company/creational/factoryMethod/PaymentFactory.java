package com.company.creational.factoryMethod;

public class PaymentFactory {
    public static Payment getPayment(PaymentType paymentType) {
        switch (paymentType) {
            case CARD_PAYMENT:
                return new CardPayment();
            case GOOGLE_PAYMENT:
                return new GooglePayment();
            default:
                return new GooglePayment();
        }
    }
}
