package com.company.creational.abstractFactory;

public class CardMaster implements Card {
    @Override
    public String getCardType() {
        return "Master Card";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000 Master Card";
    }
}
