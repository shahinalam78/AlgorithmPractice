package com.shifted.algorithm2;

 /*
    Write a program that take one number input and return fizz if the given
	 number divided by 5 and return Buzz if the given number divided by 5 && 3
            otherwise return fizz buzz.*/

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        //   System.out.println(fizzBuzz(20));

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your Number:");

        System.out.println(fizzBuzz(scan.nextInt()));


    }

    public static String fizzBuzz(int num) {

        if (num % 5 == 0 && num % 3 == 0) {

            return "buzz";

        } else if (num % 5 == 0) {

            return "fizz";

        } else {

            return "fizzbuzz";
        }

    }
}

