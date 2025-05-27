package com.company.structural.decorator.decorater1;

public class SecureDecorator extends CreditDecorator{
    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configureSecure();
    }

    private void configureSecure() {
        System.out.println("La tarjeta ha sido configurada con seguridad máxima");
    }
}
