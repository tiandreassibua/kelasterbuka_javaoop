package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // create player 1
        Player player1 = new Player("Edo");
        Armor armor1 = new Armor("Baju besi", 5, 100);
        Weapon weapon1 = new Weapon("Parang", 20);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        // create player 2
        Player player2 = new Player("Lisa");
        Armor armor2 = new Armor("Gaun pesta", 1, 40);
        Weapon weapon2 = new Weapon("Pecut", 40);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();
        
        while(player1.getIsAlive() || player2.getIsAlive()) {
            player1.attack(player2);
            player2.attack(player1);
        }
    }
}
