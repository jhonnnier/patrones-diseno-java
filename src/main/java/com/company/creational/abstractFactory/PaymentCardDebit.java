package com.company.creational.abstractFactory;

public class PaymentCardDebit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Pago a Debito ";
    }
}
