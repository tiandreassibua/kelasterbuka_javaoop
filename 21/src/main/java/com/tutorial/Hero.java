package com.tutorial;

public class Hero {
    String name;    
    double defencePower;

    public Hero(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    public Hero(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name = " + this.name);
    }
}
