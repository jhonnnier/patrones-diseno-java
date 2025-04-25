package com.company.creational.factoryMethodEjm2;

public class DialogEjm2Linux extends DialogEjm2 {
    @Override
    public ButtonEjm2 createButton() {
        return new ButtonEjm2Linux();
    }
}
