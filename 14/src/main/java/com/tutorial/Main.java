package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("All Mighty");
        Player player3 = new Player("Midnight");
        Player player4 = new Player("Mt Lady");

        Player.showNumberOfPlayer();

        System.out.println("Names = " + Player.getNames());
        System.out.println("Names = " + Player.getNames()); // ini bisa dilakukan
    }
}
