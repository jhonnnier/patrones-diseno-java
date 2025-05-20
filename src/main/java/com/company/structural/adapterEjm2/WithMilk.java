package com.company.structural.adapterEjm2;

public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", con leche";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
