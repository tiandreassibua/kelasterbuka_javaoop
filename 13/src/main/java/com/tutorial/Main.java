package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Display display1  = new Display("Monitor");
        display1.show();

        Display display2  = new Display("Smartphone");
        display2.show();

        // show static variable atau class variable
        // kita coba mengganti variable static
        display1.setType("Spanduk");
        
        System.out.println("\nMenampilkan static atau class variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
}
