package com.company.structural.decorator.decorater1;

public class PSEDecorator extends CreditDecorator{
    public PSEDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configureSecure();
    }

    private void configureSecure() {
        System.out.println("La tarjeta ha sido configurada para pagos PSE");
    }
}
