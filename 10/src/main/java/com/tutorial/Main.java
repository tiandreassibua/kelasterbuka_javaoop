package com.tutorial;

public class Main {
    public static void main(String[] args) {

        Data object = new Data();
        
        // public and write menggunakan public
        object.intPublic = 5; // write
        System.out.println("public : " + object.intPublic); // read
        
        // read only (kita menggunakan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("getter : " + angka);

        // write only
        object.setDoublePrivate(0.05);
        object.display();

        // gabungkan read dan write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("jari-jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("jari-jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());
                
    }
}
