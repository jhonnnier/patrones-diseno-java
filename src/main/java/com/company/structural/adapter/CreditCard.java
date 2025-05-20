package com.company.structural.adapter;

public class CreditCard implements Payment {
    CardAdapter adapter;

    @Override
    public void pay(String type) {
        if ("clasic".equals(type)) {
            System.out.println("Tarjeta Classic: Pagando sin ninguna seguridad");
        } else if ("black".equals(type)) {
            adapter = new CardAdapter(type);
            adapter.pay("black");
        } else if ("gold".equals(type)) {
            adapter = new CardAdapter(type);
            adapter.pay("gold");
        } else {
            System.out.println("Tipo de tarjeta no encontrado");
        }
    }
}
