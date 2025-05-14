package com.company.behavioral.mediator;

public class ConcreteMediator implements Mediator {
    private ConcreteCollege1 user1;
    private ConcreteCollege2 user2;

    public void setUser1(ConcreteCollege1 college1) {
        user1 = college1;
    }

    public void setUser2(ConcreteCollege2 college2) {
        user2 = college2;
    }

    @Override
    public void send(String message, Colleage colleage) {
        if (colleage == user1) {
            user2.receive(message);
        } else if (colleage == user2) {
            user1.receive(message);
        }
    }
}
