package com.company.structural.facade.facade1;

public class Gold implements Credit {
    @Override
    public void showCredit() {
        System.out.println("La tarjeta Gold tiene un credito de $5'000.000");
    }
}
