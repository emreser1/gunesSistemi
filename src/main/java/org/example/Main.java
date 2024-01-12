package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gezegen mercury = new Gezegen(1, 57910000, 2.439, 58.646);
        Gezegen venus = new Gezegen(2, 108200000, 6.052, 224.7);
        Gezegen earth = new Gezegen(3, 149600000, 6.371, 365.25);
        Gezegen mars = new Gezegen(4, 227940000, 3.389, 687);
        Gezegen jupiter = new Gezegen(5, 778500000, 142.984, 11.862);
        Gezegen saturn = new Gezegen(6, 1429400000, 120.536, 29.46);
        Gezegen uranus = new Gezegen(7, 287099000, 51.118, 84.01);
        Gezegen neptune = new Gezegen(8, 450430000, 49.532, 164.81);

        System.out.println("Merkür: " + mercury);
        System.out.println("Venüs: " + venus);
        System.out.println("Dünya: " + earth);
        System.out.println("Mars: " + mars);
        System.out.println("Jüpiter: " + jupiter);
        System.out.println("Satürn: " + saturn);
        System.out.println("Uranüs: " + uranus);
        System.out.println("Neptün: " + neptune);

    }

}