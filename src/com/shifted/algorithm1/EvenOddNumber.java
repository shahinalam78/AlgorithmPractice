package com.shifted.algorithm1;

import java.util.Scanner;

/**
 * Created by PaxoStudent on 6/20/2017.
 */
public class EvenOddNumber {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Enter Your Number");

        num = scan.nextInt();

        if(num % 2 != 0){

            System.out.println("OddNumber");

        }else {

            System.out.println("EvenNumber");
        }
    }
}
