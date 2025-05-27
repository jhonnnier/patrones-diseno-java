package com.company.structural.flywight;

public class Detective implements Enemy {
    private String weapon;
    private final String LIFE;

    public Detective() {
        LIFE = "1000";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida de un teniente es: " + LIFE);
    }
}
