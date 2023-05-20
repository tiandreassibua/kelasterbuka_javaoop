package com.tutorial;

public class HeroIntelligent extends Hero {
    private String type = "Intelligent";
    
    public HeroIntelligent(String nameInput, double attackInput, double healthInput) {
        super(nameInput, attackInput, healthInput);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }

    @Override
    public void takeDamage(double damage) {
        System.out.println(super.getName() + " receive damage " + 1.5 * damage);
        super.setHealth(1.5 * damage);
    }
}
