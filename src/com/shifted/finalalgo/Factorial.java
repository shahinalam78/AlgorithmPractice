package com.shifted.finalalgo;

/**
 * Created by PaxoStudent on 1/11/2018.
 */
public class Factorial {

    public static int factorial(int num){

        int fact = 1;

        for (int i = num; i >= 1; i--){

             fact = fact * i;
        }

        return fact;
    }



    public static void main(String[] args) {

        System.out.println(factorial(4));
    }
}
