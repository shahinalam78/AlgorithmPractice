package com.shifted.algorithm;

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
    }
}