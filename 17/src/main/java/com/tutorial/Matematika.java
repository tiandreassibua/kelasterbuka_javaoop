package com.tutorial;

public class Matematika {
    public static int tambah(int x, int y) {
        return x + y;
    }

    public static int tambah(double x, int y) {
        return (int)x + y;
    }

    public static int tambah(int x, double y) {
        return x + (int)y;
    }
    
    public static int tambah(double x, double y) {
        return (int)(x + y);
    }
}