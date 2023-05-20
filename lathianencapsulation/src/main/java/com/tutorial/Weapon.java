package com.tutorial;

public class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }

    public String getWeaponName() {
        return this.name;
    }
}
