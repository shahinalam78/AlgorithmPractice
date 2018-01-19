package com.shifted.finalalgo;

import java.util.Scanner;

/**
 * Created by PaxoStudent on 1/11/2018.
 */
public class OddEven {

    public static String oddEvev(int num){

        if(num % 2 == 0){

            return "even";

        }else {

            return "odd";
        }
    }

    public static void main(String[] args) {

        System.out.println("Plese Enter Your Number: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Number is: " + oddEvev(num));

    }
}
