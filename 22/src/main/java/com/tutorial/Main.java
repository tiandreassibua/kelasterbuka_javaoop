package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Tanjiro", 10, 100);
        // HeroStrength hero2 = new HeroStrength("Zenitsu", 20, 100);
        HeroIntelligent hero3 = new HeroIntelligent("Zilong", 25, 100);
        
        hero1.display();
        hero3.display();
        
        hero1.attack(hero3);
        hero3.attack(hero1);

        hero1.display();
        hero3.display();
    }
}
