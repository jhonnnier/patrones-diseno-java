package com.company.behavioral.mediator;

public class ConcreteCollege1 extends Colleage {
    public ConcreteCollege1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colega 1 ha recibido el siguiente mensaje: " + message);
    }
}
