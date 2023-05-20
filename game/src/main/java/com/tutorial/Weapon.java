package com.tutorial;

public class Weapon {
    double attackPower;
    String name;

    public Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Weapon : " + this.name + ", attack : " + this.attackPower);
    }
}
