package com.company.structural.adapter;

public class GoldCreditCard implements Secure {
    @Override
    public void payWithSecureLevelA() {
        //        No Implementar
    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Tarjeta Gold y estas pagando con seguridad baja Nivel Z");
    }
}
