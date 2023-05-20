package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("edo", 0, 100);

        // default
        System.out.println(player1.name);
        player1.name = "lisa";
        System.out.println(player1.name);
        
        // public
        System.out.println(player1.exp);
        player1.exp = 100;
        System.out.println(player1.exp);
        
        // private (tidak bisa diakses)
        // System.out.println(player1.health);
        // player1.health = 100;
        // System.out.println(player1.health);

        // methods
        // default
        player1.display();
        
        // public
        player1.ubahNama("gaza");
        player1.display();

        // private (tidak bisa diakses dari luar)
        // player1.tambahExp();
    }
}
