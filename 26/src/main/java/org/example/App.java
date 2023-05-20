package org.example;

//import org.Hero.Hero;
import org.Hero.HeroAgility;
import org.Hero.HeroIntel;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // membuat object dari class non-absctract
        HeroIntel hero1 = new HeroIntel("Otong");
        hero1.display();

        HeroAgility hero2 = new HeroAgility("Mario");
        hero2.display();

        // membuat object dari class abstract
        // Hero hero2 = new Hero("Mario");
        // hero2.display();
    }
}
