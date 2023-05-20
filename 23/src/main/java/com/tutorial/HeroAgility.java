package com.tutorial;

public class HeroAgility extends Hero {
    String type = "Agility";

    public HeroAgility(String nama) {
        super(nama);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }

    public void showOff() {
        System.out.println("Saya hero agility");
    }
}
