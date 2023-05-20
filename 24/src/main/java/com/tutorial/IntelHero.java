package com.tutorial;

public class IntelHero extends Hero {
    IntelHero(String name, double health) {
        super(name, health);
    }

    @Override
    public void display() {
        System.out.println(this.name + " mempunyai banyak " + super.getHealth());
    }

    @Override
    final void setHealth(double newHealth) {
        System.out.println("mencoba memasukan health = " + newHealth);
    }
}
