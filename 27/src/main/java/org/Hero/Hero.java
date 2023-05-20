package org.Hero;

public abstract class Hero {
    public String name;
    private int level;
    public Hero(String name) {
        this.name = name;
        this.level = 1;
    }

    public void display() {
        System.out.println("\nAku adalah " + this.name);
        System.out.println("Level " + this.level);
    }

    public abstract void levelUp();

    public void setLevel(int deltaLevel) {
        this.level += deltaLevel;
        System.out.println(this.name + " naik level!");
    }
}
