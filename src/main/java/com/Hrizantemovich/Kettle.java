package com.Hrizantemovich;

public class Kettle {
    String brand;
    int volume;
    boolean Electric;
    boolean NotElectric;

    public Kettle(String brand, int volume, boolean electric, boolean notElectric) {
        this.brand = brand;
        this.volume = volume;
        this.Electric = electric;
        this.NotElectric = notElectric;


        if (electric) {
            System.out.println("zarya");
        }
        else (notElectric) {
                System.out.println("Siemens");

    }
    }
}











