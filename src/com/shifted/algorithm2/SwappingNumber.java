package com.shifted.algorithm2;

/**
 * Created by PaxoStudent on 8/22/2017.
 */
public class SwappingNumber {

    public static void main(String[] args) {

      // swapNumber(30,40);

       // sswapNumber(40,60);

       // swwapNumber(50,60);

        sssNumber(100,200);
    }

    public static void swapNumber(int x, int y){

         x = x + y;

         y = x - y;

         x = x - y;

        System.out.println(x);

        System.out.println(y);
    }

    public static void sswapNumber(int x, int y){

        x = x + y;

        y = x - y;

        x = x - y;

        System.out.println(x);

        System.out.println(y);
    }

    public static void swwapNumber(int x, int y){

        x = x + y;

        y = x - y;

        x = x - y;

        System.out.println(x);

        System.out.println(y);

    }

    public static void sssNumber(int x, int y){

        int z = x;

        x = y;

        y = z;

        System.out.println(x);

        System.out.println(y);
    }
}
