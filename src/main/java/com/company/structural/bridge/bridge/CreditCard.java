package com.company.structural.bridge.bridge;

public abstract class CreditCard {
    protected ICreditCard tarjeta;
    
    protected CreditCard(ICreditCard tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public abstract void realizarPago();
}
