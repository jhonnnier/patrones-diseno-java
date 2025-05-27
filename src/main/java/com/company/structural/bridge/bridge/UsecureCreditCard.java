package com.company.structural.bridge.bridge;

public class UsecureCreditCard implements ICreditCard {
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado sin seguridad");
    }
}
