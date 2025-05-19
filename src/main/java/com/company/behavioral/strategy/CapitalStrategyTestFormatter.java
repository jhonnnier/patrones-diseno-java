package com.company.behavioral.strategy;

public class CapitalStrategyTestFormatter implements StrategyTextFormatter {
    @Override
    public void format(String text) {
        System.out.println("Texto en mayusculas: " + text.toLowerCase());
    }
}
