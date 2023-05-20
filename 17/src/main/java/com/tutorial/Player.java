package com.tutorial;

public class Player {
    private static int jumlahPlayer = 1;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Player() {
        this.name = "player" + this.jumlahPlayer;
        Player.jumlahPlayer++;
    }

    public void show() {
        System.out.println("Name : " + this.name);
    }
}
