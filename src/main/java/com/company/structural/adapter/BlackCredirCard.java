package com.company.structural.adapter;

public class BlackCredirCard implements Secure {
    @Override
    public void payWithSecureLevelA() {
        System.out.println("Tarjeta Black y estas pagando con seguridad baja Nivel A");
    }

    @Override
    public void payWithSecureLevelZ() {
//        No Implementar        
    }
}
