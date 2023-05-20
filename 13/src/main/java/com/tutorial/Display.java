package com.tutorial;

public class Display {
    static String type = "Display";
    private String name;

    public Display(String name) {
        this.name = name;
    }

    public void setType(String typeInput) {
        // type = typeInput; // alternatif 1
        // this.type = typeInput; // alternatif 2
        Display.type = typeInput;
    }

    public void show() {
        System.out.println("Display name = " + this.name);
    }
}
