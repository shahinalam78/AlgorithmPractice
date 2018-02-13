package com.shifted.algorithm2;

/**
 * Created by PaxoStudent on 8/22/2017.
 */
public class PrimeNumber {

    public static void main(String[] args) {

        // System.out.println(primenumber(137));

       // System.out.println(isPrime(10));

        System.out.println(issprime(6));
    }

    public static boolean primenumber(int num) {

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {

                return false;
            }
        }

        return true;
    }



    public static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {

                return false;
            }
        }

        return true;
    }

    public static boolean issprime(int num){

        for (int i = 2; i <= num / 2; i++){

            if(num % i == 0){

                return false;
            }
        }

        return true;
    }

}
