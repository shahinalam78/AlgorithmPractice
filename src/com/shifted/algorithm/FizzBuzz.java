package com.shifted.algorithm;

import java.util.Scanner;

/**
 * Created by PaxoStudent on 6/20/2017.
 */
public class FizzBuzz {
/*
    Write a program that take one number input and return fizz if the given
	 number divided by 5 and return Buzz if the given number divided by 5 && 3
            otherwise return fizz buzz.*/

    public static void main(String[] args) {

        Scanner sacn = new Scanner(System.in);

        int num;

        System.out.println("Enter Your Number");

        num = sacn.nextInt();

        if ((num % 5 == 0) && (num % 3 == 0)) {

            System.out.println("Buzz");

        } else if (num % 3 == 0) {

            System.out.println("Fizz");

        } else {

            System.out.println("FizzBuzz");
        }
    }
}