package com.company.creational.factoryMethodEjm2;

public abstract class DialogEjm2 {
    public void renderWindow() {
        // Lógica común
        ButtonEjm2 okButton = createButton();
        okButton.render();
    }

    // Factory Method
    public abstract ButtonEjm2 createButton();
}
