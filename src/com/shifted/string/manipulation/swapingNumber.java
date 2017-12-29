package com.shifted.string.manipulation;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by PaxoStudent on 10/10/2017.
 */
public class swapingNumber {

    public static void main(String[] args) {

        //swingNumber(30,50);

        swwapingNumber(30,50);

    }

    public static void swingNumber(int x, int y){


        x = x + y;

         y = x - y;

        x = x - y;

        System.out.println("Value of X:" + x);

        System.out.println("Value of Y:" + y);

    }

    public static void swwapingNumber(int x, int y){

        int z = x;

        x = y;

        y = z;

        System.out.println("Value of X:" + x);

        System.out.println("Value of Y:" + y);

    }


}
