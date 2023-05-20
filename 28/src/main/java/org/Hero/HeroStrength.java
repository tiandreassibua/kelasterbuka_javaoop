package org.Hero;

public class HeroStrength extends Hero{
    public HeroStrength(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Name\t: " + this.name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
