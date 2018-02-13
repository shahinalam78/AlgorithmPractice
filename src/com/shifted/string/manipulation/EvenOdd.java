package com.shifted.string.manipulation;

import java.util.Scanner;

/**
 * Created by PaxoStudent on 12/28/2017.
 */
public class EvenOdd {

    public static String evenOdd(int num){

        if(num % 2 == 0){

            return "even";

        } else {

           return "odd";
        }
    }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Plese Enter Your Number:");

        System.out.println(evenOdd(sc.nextInt()));


    }
}
