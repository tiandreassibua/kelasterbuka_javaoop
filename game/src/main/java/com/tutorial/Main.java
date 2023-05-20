package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // membuat object player
        Player player1 = new Player("Edo", 100);
        Player player2 = new Player("lisa", 50);
        
        // membuat object weapon
        Weapon pedang = new Weapon("Pedang",15);
        Weapon ketapel = new Weapon("Ketapel",1);
        
        // membuat object armor
        Armor bajuBesi = new Armor("Baju besi",10);
        Armor kaos = new Armor("kaos",0);

        // player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();

        System.out.println("\nPERTEMPURAN");

        System.out.println("\nEpisode - 1");
        player1.attack(player2);
        System.out.println("\nInfo player:");
        player1.display();
        player2.display();
        
        System.out.println("\nEpisode - 2");
        player2.attack(player1);
        System.out.println("\nInfo player:");
        player1.display();
        player2.display();
    }
}
