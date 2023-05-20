package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1  = new Hero("Ucup", 100);
        IntelHero hero2 = new IntelHero("Otong", 50);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(120);
        hero2.setHealth(180);

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());
    }
}