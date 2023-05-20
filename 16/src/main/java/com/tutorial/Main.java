package com.tutorial;

import com.terminal.Console;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Edo");
        player1.show();

        Console.log(player1.getName());
    }
}
