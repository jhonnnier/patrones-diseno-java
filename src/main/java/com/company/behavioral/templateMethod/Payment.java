package com.company.behavioral.templateMethod;

public abstract class Payment {
    abstract void initialize();

    abstract void startPayment();

    abstract void endPayment();

    /*
        final por que nadie puede alterar el orden de los pasos    
     */
    public final void makePayment() {
        initialize();
        startPayment();
        endPayment();
    }
}
