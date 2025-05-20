package com.company.structural.adapter;

public class CardAdapter implements Payment {
    Secure secureCreditCard;

    public CardAdapter(String type) {
        if ("black".equals(type)) {
            secureCreditCard = new BlackCredirCard();
        } else if ("gold".equals(type)) {
            secureCreditCard = new GoldCreditCard();
        }
    }

    @Override
    public void pay(String type) {
        if ("black".equals(type)) {
            secureCreditCard.payWithSecureLevelA();
        } else if ("gold".equals(type)) {
            secureCreditCard.payWithSecureLevelZ();
        }
    }
}
