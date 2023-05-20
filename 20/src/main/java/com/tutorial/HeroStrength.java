package com.tutorial;

// this.name akan mengakses atribut name kalau ada di class ini
// jika tidak ada maka akan mengakses atribut name dari superclass

// super.name akan selalu mengakses atribut superclass
public class HeroStrength extends Hero {
    String name = "Class Strength";

    public void display() {
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
    }
    
    public void displaySuper() {
        System.out.println("Ini adalah " + super.name);
        super.dummyMethod();
    }

    // public void dummyMethod() {
    //     System.out.println("Method ini ada di subclass");
    // }
}
