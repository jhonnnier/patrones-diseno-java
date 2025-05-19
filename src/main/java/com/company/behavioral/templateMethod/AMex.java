package com.company.behavioral.templateMethod;

public class AMex extends Payment {

    @Override
    void initialize() {
        System.out.println("Inicializando el pago con AMEX");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con AMEX");
    }

    @Override
    void endPayment() {
        System.out.println("Pago realizado correctamente con AMEX");
    }
}
