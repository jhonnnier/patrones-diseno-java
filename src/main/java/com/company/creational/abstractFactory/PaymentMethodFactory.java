package com.company.creational.abstractFactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {
    @Override
    public PaymentMethod create(String type) {
        if ("CREDIT".equals(type)) {
            return new PaymentCardCredit();
        } else if ("DEBIT".equals(type)) {
            return new PaymentCardDebit();
        }

        return null;
    }
}
