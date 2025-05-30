package com.company.structural.decorator.decorater1;

public class InternationalPaymentDecorator extends CreditDecorator {
    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment() {
        System.out.println("La tarjeta ha sido configurada para hacer pagos internecionales");
    }
}
