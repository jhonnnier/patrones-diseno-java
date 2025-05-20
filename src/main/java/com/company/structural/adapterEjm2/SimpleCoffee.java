package com.company.structural.adapterEjm2;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Café simple";
    }

    @Override
    public double getCost() {
        return 1.00;
    }
}
