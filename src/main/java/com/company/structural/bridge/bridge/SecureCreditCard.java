package com.company.structural.bridge.bridge;

public class SecureCreditCard implements ICreditCard {
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con seguridad");
    }
}
