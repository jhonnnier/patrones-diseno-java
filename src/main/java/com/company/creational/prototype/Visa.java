package com.company.creational.prototype;

public class Visa implements PrototypeCard {
    private String name;

    @Override
    public void getCard() {
        System.out.println("Visa's card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Cloning Visa...");
        return (Visa) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
