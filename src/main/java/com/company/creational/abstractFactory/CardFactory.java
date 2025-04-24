package com.company.creational.abstractFactory;

public class CardFactory implements AbstractFactory<Card> {
    @Override
    public Card create(String type) {
        if ("VISA".equals(type)) {
            return new CardVisa();
        } else if ("MASTERCARD".equals(type)) {
            return new CardMaster();
        }

        return null;
    }
}
