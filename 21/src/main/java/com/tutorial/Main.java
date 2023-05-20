package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Esmeralda", 10);
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Dynamo", 12);
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Belut");
        hero3.display();
    }
}
