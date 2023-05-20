package com.tutorial;

// keyword import untuk package external
import com.terminal.Console;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Edo");
        Player player2 = new Player("Lisa");
        Player player3 = new Player("Saitama");

        player1.show();
        player2.show();
        player3.show();

        Console.log("Hallo");
        Console.log("Hallo");
    }
}
