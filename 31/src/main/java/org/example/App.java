package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Hero hero1 = new Hero("ucup", 100);
        Hero hero2 = new Hero("Otong", 100);
        AgilityHero heroAgility = new AgilityHero("Dudung", 50);
        IntelHero heroIntel = new IntelHero("Jhony", 20);

        ArrayList<Hero> listHero = new ArrayList<Hero>();
        System.out.println("\nOperasi 1: add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(heroAgility);
        System.out.println(listHero);

        System.out.println("\nOperasi 2: set");
        listHero.set(1, heroIntel);
        System.out.println(listHero);

        System.out.println("\nOperasi 3: remove");
        listHero.remove(1);
        System.out.println(listHero);

        System.out.println("\nOperasi 4: get");
        System.out.println(listHero);
        Hero heroAmbil = listHero.get(0);
        System.out.println(listHero);
        heroAmbil.display();

        // method pada ArrayList
        System.out.println("\nMethod-method pada ArrayList");
        System.out.println("1. size()\t\t\t\t\t : " + listHero.size());
        System.out.println("2. isEmpty()\t\t\t\t : " + listHero.isEmpty());
        System.out.println("3. contains(hero2)\t\t\t : " + listHero.contains(hero2));
        System.out.println("   contains(heroAgility)\t : " + listHero.contains(heroAgility));
        System.out.println("4. indexOf(hero1)\t\t\t : " + listHero.indexOf(hero1));
        System.out.println("   indexOf(heroAgility)\t\t : " + listHero.indexOf(heroAgility));
    }
}
