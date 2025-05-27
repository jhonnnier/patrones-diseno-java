package com.company.structural.facade.facade1;

public class CreditMarketFacade {
    private Credit gold;
    private Credit silver;
    private Credit black;

    public CreditMarketFacade() {
        this.gold = new Gold();
        this.silver = new Silver();
        this.black = new Black();
    }

    public void showCreditGold() {
        gold.showCredit();
    }

    public void showCreditSilver() {
        silver.showCredit();
    }

    public void showCreditBlack() {
        black.showCredit();
    }
}
