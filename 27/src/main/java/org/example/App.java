package org.example;

//import org.Hero.Hero;
import org.Hero.HeroAgility;
import org.Hero.HeroIntel;
import org.Hero.HeroStrength;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // membuat object dari class non-absctract
        HeroIntel hero1 = new HeroIntel("Otong");
        HeroAgility hero2 = new HeroAgility("Mario");
        HeroStrength hero3 = new HeroStrength("Ucup");

        System.out.println("Init hero!");
        hero1.display();
        hero2.display();
        hero3.display();

        System.out.println();
        hero1.levelUp();
        hero2.levelUp();
        hero3.levelUp();

        System.out.println("\nInformasi hero:");
        hero1.display();
        hero2.display();
        hero3.display();
    }
}
