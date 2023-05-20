package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Dilan 1990", "Pidi Baiq");
        buku1.display();
        
        // menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);
        
        // assignment object
        // Buku buku2= new Buku("Milea 1991", "Pidi Baiq");
        Buku buku2 = buku1;
        buku2.display();
        
        // menampilkan address
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);
        
        buku2.judul = "Membunuh komandantur";
        buku1.display();
        buku2.display();

        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku) {
        String addresDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi : " + addresDataBuku);
        dataBuku.penulis = "Pidi Jahad";
    }
}
