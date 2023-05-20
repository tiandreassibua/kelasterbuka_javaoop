package com.tutorial;

public class Hero {
    // attribute
    private String name;
    private double attackPower, health;
    
    // constructor
    public Hero(String nameInput, double attackInput, double healthInput) {
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    public String getName() {
        return this.name;
    }

    public double getAttackPower() {
        return this.attackPower;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double damage) {
        this.health -= damage;
    }

    public void attack(Hero enemy) {
        System.out.println("\n" + this.name + " attacking " + enemy.getName());
        enemy.takeDamage(this.getAttackPower());
    }

    public void takeDamage(double damage) {
        System.out.println(this.name + " receive damage " + damage);
        this.setHealth(damage);
    }

    public void display() {
        System.out.println("\nName\t: " + this.name);
        System.out.println("Health\t: " + this.health);
        System.out.println("Attack\t: " + this.attackPower);
    }
}
