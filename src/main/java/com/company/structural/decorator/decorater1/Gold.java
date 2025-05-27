package com.company.structural.decorator.decorater1;

public class Gold implements Credit {
    @Override
    public void showCredit() {
        System.out.println("El credito es de $500.000");
    }
}
