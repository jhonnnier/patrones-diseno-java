package com.company.creational.prototype;

public class Amex implements PrototypeCard{
    private String name;


    @Override
    public void getCard() {
        System.out.println("American Express's card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Cloning American Express...");
        return (Amex) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
