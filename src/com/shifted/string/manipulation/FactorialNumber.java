package com.shifted.string.manipulation;

/**
 * Created by PaxoStudent on 12/29/2017.
 */
public class FactorialNumber {

    public static int factorial(int num){

        int result = 1;

        for(int i = 1; i <= num; i++){

            result = result * i;

        }

        return result;
    }

    public static int facttorial(int x){

        int result = 1;

        for(int i = 1; i <= x; i++){

          result = result * i;
        }

        return result;
    }




    public static void main(String[] args){

        System.out.println(facttorial(6));

       // System.out.println(factorial(5));
    }
}
