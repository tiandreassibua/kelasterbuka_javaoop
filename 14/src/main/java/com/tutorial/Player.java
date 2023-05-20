package com.tutorial;

import java.util.ArrayList;

public class Player {
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    public Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    public void show() {
        System.out.println("Player name = " + this.name);
    }
    
    // ini adalah static method
    public static void showNumberOfPlayer() {
        System.out.println("Number of Player = " + Player.numberOfPlayer);
    }

    public static ArrayList<String> getNames() {
        return Player.nameList;
    }
}
