package com.company.structural.facade.facade1;

public class Black implements Credit {
    @Override
    public void showCredit() {
        System.out.println("La tarjeta Black tiene un credito de $1'000.000");
    }
}
