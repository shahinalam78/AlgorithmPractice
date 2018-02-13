package com.shifted.finalalgo;


public class SwappingNumber {

    public static void main(String[] args) {

       // swappingNumber(10,20);

        sswappingNumber(20,30);

    }

    // using 3rd variable

    public static void swappingNumber(int x, int y){

        int z = x;

        x = y;

        y = z;

        System.out.println("Number of X: "+ x);

        System.out.println("Number of Y: "+ y);
    }

    //not using 3rd variable

    public static void sswappingNumber(int x, int y){

        x = x + y;

        y = x - y;

        x = x - y;

        System.out.println("Number of X: "+ x);

        System.out.println("Number of Y: "+ y);
    }
}
