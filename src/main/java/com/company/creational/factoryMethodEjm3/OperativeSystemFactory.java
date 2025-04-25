package com.company.creational.factoryMethodEjm3;

public class OperativeSystemFactory {
    public static ButtonEjm3 getButtonEjm3(OperativeSystemType operativeSystem) {
        switch (operativeSystem) {
            case WINDOWS:
                return new ButtonEjm3Windows();
            case LINUX:
                return new ButtonEjm3Linux();
            default:
                return new ButtonEjm3Windows();

        }
    }
}
