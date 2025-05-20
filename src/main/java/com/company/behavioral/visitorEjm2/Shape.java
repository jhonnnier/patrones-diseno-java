package com.company.behavioral.visitorEjm2;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
