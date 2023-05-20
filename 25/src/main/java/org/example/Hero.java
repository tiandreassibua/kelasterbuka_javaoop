package org.example;

public class Hero {
    private String name;
    private double health;

    public Hero(String name,  double health) {
        this.name = name;
        this.health = health;
    }

    public double getHealth() {
        return this.health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void display() {
        System.out.println(getName() + " is a regular hero!");
    }
}
