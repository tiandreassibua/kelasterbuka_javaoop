package org.example;

public class HeroIntel extends Hero {
    public String type;
    public HeroIntel(String name, double health) {
        super(name, health);
        this.type = "Intel";
    }

    public void display() {
        System.out.println(this.getName() +  " is an " + this.type + " hero!");
    }

    public void casMagic() {
        System.out.println("Mengeluarkan magic!");
    }
}
