package com.company.behavioral.interpreter;

import com.company.behavioral.state.MobileAlertStateContext;

public class TerminalExpresion implements Expresion {
    private String text;

    public TerminalExpresion(String text) {
        this.text = text;
    }

    @Override
    public boolean interpreter(String context) {
        if (context.contains(text)) {
            return true;
        }

        return false;
    }
}
