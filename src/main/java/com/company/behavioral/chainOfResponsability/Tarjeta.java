package com.company.behavioral.chainOfResponsability;

public class Tarjeta implements ApproveLoanChain {

    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void crediCardRequest(int totalLoan) {
        ConcreteHandlerGoldCard gold = new ConcreteHandlerGoldCard();
        this.setNext(gold);

        ConcreteHandlerPlatiniumCard platinium = new ConcreteHandlerPlatiniumCard();
        gold.setNext(platinium);

        ConcreteHandlerBlackCard black = new ConcreteHandlerBlackCard();
        platinium.setNext(black);

        next.crediCardRequest(totalLoan);
    }
}
