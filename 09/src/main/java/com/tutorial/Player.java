package com.tutorial;

public class Player {
    String name; // default, bisa read and write dari luar class
    public int exp; // public, bisa read and write dari luar class
    private int health; // private, hanya bisa read and write dari dalam class itu sendiri

    public Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier access
    public void display() {
        tambahExp();
        System.out.println("\nName\t: " + this.name);
        System.out.println("Exp\t: " + this.exp);
        System.out.println("Health\t: " + this.health); // membaca dari dalam class
    }

    // private
    public void ubahNama(String namaBaru) {
        this.name = namaBaru;
    }

    // private
    private void tambahExp() {
        this.exp += 100;
    }
}
