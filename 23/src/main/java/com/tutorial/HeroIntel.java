package com.tutorial;

public class HeroIntel extends Hero {
    String type = "Intel";

    public HeroIntel(String nama) {
        super(nama);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }
}