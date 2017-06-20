package com.shifted.algorithm;

/**
 * Created by PaxoStudent on 6/20/2017.
 */
public class PrimeNumber {

    // IsPrime Number(Prime number is greater than 1 and divided by 1 and itself)

    public static void main(String[] args) {

       /* System.out.println(isPrime(3));
        System.out.println(isPrime(17));
        System.out.println(isPrime(137));
        System.out.println(isPrime(30));
*/


        System.out.println(primeNumber(5));

        System.out.println(primeNumber(10));
    }

    public static boolean isPrime(int num){

        System.out.println("Checked Prime Number: " + num);

        for(int i = 2; i <= num / 2; i++){

            if( num % i == 0){

                return false;
            }
        }

        return true;

    }


    public static boolean primeNumber(int num){

        System.out.println("Checked Prime Number: " + num);

        for(int i = 2; i <= num / 2; i++){

            if(num % i == 0 ){

                return false;
            }
        }
        return true;
    }
}
