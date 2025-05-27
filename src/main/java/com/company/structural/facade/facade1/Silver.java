package com.company.structural.facade.facade1;

public class Silver implements Credit {
    @Override
    public void showCredit() {
        System.out.println("La tarjeta Silver tiene un credito de $1'500.000");
    }
}
