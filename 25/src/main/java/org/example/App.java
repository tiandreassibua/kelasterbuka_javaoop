package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();

        // up casting
        Hero heroUp = (Hero) hero1;
        heroUp.display();

        // ada field yg hilang
        // System.out.println(heroUp.type);
        // heroUp.castMagic();

        Hero heroReg = new Hero("Otong", 100);
        heroReg.display();

        // down casting dari Superclass ke subclass, TIDAK BISA
        // HeroAgility heroDown = (HeroAgility) heroReg;
        // heroDown.display();

        // coba dari hero biasa ke hero intel
        HeroIntel hero2 = (HeroIntel) heroUp;


        // berhasil di down casting, dengan syarat bentuk awalnya sama
        hero2.display();
        System.out.println(hero2.type);
        hero2.casMagic();
    }
}
