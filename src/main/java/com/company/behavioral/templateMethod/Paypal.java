package com.company.behavioral.templateMethod;

public class Paypal extends Payment {

    @Override
    void initialize() {
        System.out.println("Inicializando el pago con PayPal");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con PayPal");
    }

    @Override
    void endPayment() {
        System.out.println("Pago realizado correctamente con PayPal");
    }
}
