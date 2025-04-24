package com.company.creational.abstractFactory;

public class CardVisa implements Card {
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000 VISA ";
    }
}
