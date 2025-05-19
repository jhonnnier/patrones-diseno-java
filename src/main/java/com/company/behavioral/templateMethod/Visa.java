package com.company.behavioral.templateMethod;

public class Visa extends Payment {

    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Visa");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Visa");
    }

    @Override
    void endPayment() {
        System.out.println("Pago realizado correctamente con Visa");
    }
}
