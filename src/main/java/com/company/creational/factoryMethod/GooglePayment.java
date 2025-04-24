package com.company.creational.factoryMethod;

public class GooglePayment implements Payment {
    
    @Override
    public void doPayment() {
        System.out.println("Google Payment is running.");
    }
}
