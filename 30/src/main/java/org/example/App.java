package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Otong", 20);
        AgilityHero agilityHero = new AgilityHero("Jhonny", 500);
        IntelHero intelHero = new IntelHero("Smith", 5);

        // Array sederhana
        Hero[] kumpulanHero = new Hero[3];

        // masuakan anggota
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = agilityHero;
//        kumpulanHero[3] = intelHero;

        System.out.println("Array list Hero biasa!");
        for (Hero hero : kumpulanHero) {
            hero.display();
        }

        // Array list
        ArrayList<Hero> listHero = new ArrayList<Hero>();

        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(agilityHero);
        listHero.add(intelHero);

        System.out.println("\nArray list Hero!");
        for (Hero hero : listHero) {
            hero.display();
        }

        agilityHero.setName("Dudung");

        System.out.println("\nArray list Hero!");
        for (Hero hero : listHero) {
            hero.display();
        }

        System.out.println("\nArray list Hero biasa!");
        for (Hero hero : kumpulanHero) {
            hero.display();
        }

    }
}
