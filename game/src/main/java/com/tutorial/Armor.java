package com.tutorial;

public class Armor {
    double defencePower;
    String name;

    public Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    public void display() {
        System.out.println("Armor : " + this.name + ", defence : " + this.defencePower);
    }
}
