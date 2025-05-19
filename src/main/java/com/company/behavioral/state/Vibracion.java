package com.company.behavioral.state;

public class Vibracion implements MobileAlertState {
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Vibrando... Vibrando...");
    }
}
