package com.tutorial;

public class Hero {
    String nama;

    public Hero(String nama) {
        this.nama = nama;
    }

    public void display() {
        System.out.println("\nNama\t: " + this.nama);
    }

    public void attack(Hero enemy) {
        System.out.println(this.nama + " Menyerang");
    }
}
