package com.company.behavioral.interpreter;

public class AndExpresion implements Expresion {
    private Expresion expresion1;
    private Expresion expresion2;

    public AndExpresion(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    @Override
    public boolean interpreter(String context) {
        return expresion1.interpreter(context) && expresion2.interpreter(context);
    }
}
