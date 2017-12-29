package com.shifted.algorithm1;

/**
 * Created by PaxoStudent on 6/20/2017.
 */
public class SwappingVariable {

    public static void main(String[] args) {

      int x = 20;

        int y = 30;

        int z = x;

        x = y;

        y = z;

        System.out.println("X: " + x);

        System.out.println("Y: " + y);


        swappingNumber(10,20);
    }


    public static int swappingNumber(int p, int q) {

        p = 10;

        q = 20;

        p = p + q;

        q = p - q;

        p =  p - q;

        System.out.println(p);

        System.out.println(q);

        return 0;

    }



}