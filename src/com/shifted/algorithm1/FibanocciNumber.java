package com.shifted.algorithm1;

import java.util.Scanner;

/**
 * Created by PaxoStudent on 6/22/2017.
 */
public class FibanocciNumber {

    /*
     Fibonacci number is next number you can found to adding before two number.
    like, 0,1,1,2,3,5,8,13,21....so on
    Rule is: Xn = Xn-1 + Xn-2

    where:
     Xn is term number "n"
     Xn-1 is the previous term (n-1)
     Xn-2 is the term before that (n-2)
     */

    public static void main(String[] args) {

        //input to print Fibonacci series upto how many numbers

        System.out.println(" Enter Your Upto Fibanacci Number n = 6");

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println("Fibonacci series upto " + n + " numbers : ");

        //printing Fibonacci series upto number

        for (int i = 1; i <= n; i++) {

            System.out.print(fib(i) + " " );
        }

    }


    public static int fib(int n) {

        if (n == 1 || n == 2) {

            return 1;

        } else {

            int fibs = fib(n - 1) + fib(n - 2); // by fibonacci rule

            return fibs;
        }

    }

   /*public static int fib(int n){

       if((n == 1) || (n == 2)){

           return 1;

       } else {

           int fib1 = 1;
           int fib2 = 1;
           int fibanacci = 1;

           for (int i = 3;  i <= n; i++ ){

               fibanacci = fib1 + fib2;

               fib1 = fib2;

               fib2 = fibanacci;
           }
           return fibanacci;
       }

   }
*/



}
