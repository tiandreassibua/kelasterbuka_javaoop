package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup");
        hero1.display();

        Object hero2 = hero1;

        String hero1_str = hero1.toString();
        String hero2_str = hero2.toString();
        System.out.println(hero1_str);
        System.out.println(hero2_str);

        System.out.println(hero1.equals(hero2));

        Hero hero3 = new Hero("Otong");
        Hero hero4 = new Hero("Otong");
        Hero hero5 = new Hero("Otong");

        Jagoan hero6 = new Jagoan("Otong");

        System.out.println(hero3.equals(hero4));

        System.out.println(hero3.equals(hero1));
    }
}