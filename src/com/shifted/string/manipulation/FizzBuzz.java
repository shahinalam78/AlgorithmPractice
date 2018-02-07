package com.shifted.string.manipulation;

import java.util.Scanner;

/**
 * Created by PaxoStudent on 12/28/2017.
 */
public class FizzBuzz {

    /*
    Write a program that take one number input and return fizz if the given
	 number divided by 5 and return Buzz if the given number divided by 5 && 3
            otherwise return fizz buzz.*/


    public static String fizzBuzz(int num) {

        if (num % 5 == 0 && num % 3 == 0) {

            return "buzz";

        } else if (num % 3 == 0) {

            return "fizz";

        } else {

            return "fizzbuzz";

        }
    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println(fizzBuzz(sc.nextInt()));

    }

}

