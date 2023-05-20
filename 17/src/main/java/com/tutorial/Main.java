package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // overloading pada constructor
        Player player1 = new Player("Saitama");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Asta");
        
        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading
        int a = Matematika.tambah(0.1, 0.5);
        System.out.println(a);
    }
}
