package com.shifted.algorithm2;

/**
 * Created by PaxoStudent on 8/22/2017.
 */
public class FibanocciNumber {

    public static void main(String[] args) {

       // System.out.println(fib(6));

        System.out.println(fibs(5));

        int n = 6;

        for(int i = 2; i <= 6; i++){

            //System.out.println(fibanocci(i));

            System.out.println(fib(i));
        }

    }

    public static int fibanocci(int n) {

        if (n == 1 || n == 2) {

            return 1;

        } else {

            int fibanoccii = fibanocci(n - 1) + fibanocci(n - 2);

            return fibanoccii;

        }

    }




    public static int fib(int n){

        if(n == 1 || n == 2){

            return 1;

        } else {

            int fib = fib(n-1) + fib(n-2);

            return fib;
        }
    }

    public static int fibs(int n){

        if((n == 1)||(n == 2)){

            return 1;

        } else {

            int fibs = fibs(n-1)+fibs(n-2);

            return fibs;
        }
    }
}
