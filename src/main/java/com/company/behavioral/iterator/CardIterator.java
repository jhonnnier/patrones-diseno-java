package com.company.behavioral.iterator;

public class CardIterator implements Iterator {
    private Card[] cards;
    private int position = 0;

    public CardIterator(Card[] cards) {
        this.cards = cards;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position >= cards.length) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return cards[position++];
    }

    @Override
    public Object getCurrentItem() {
        return cards[position];
    }
}
