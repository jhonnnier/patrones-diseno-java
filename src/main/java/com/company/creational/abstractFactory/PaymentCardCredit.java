package com.company.creational.abstractFactory;

public class PaymentCardCredit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago a credito";
    }
}
