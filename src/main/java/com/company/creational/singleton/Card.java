package com.company.creational.singleton;

public class Card {
    private static Card INSTANCE;
    private String cardNumber;

    private Card() {

    }

    public synchronized static Card getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Card();
        }

        return INSTANCE;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
