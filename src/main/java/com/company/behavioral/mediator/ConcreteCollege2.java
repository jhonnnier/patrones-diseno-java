package com.company.behavioral.mediator;

public class ConcreteCollege2 extends Colleage {
    public ConcreteCollege2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colega 2 ha recibido el siguiente mensaje: " + message);
    }
}
