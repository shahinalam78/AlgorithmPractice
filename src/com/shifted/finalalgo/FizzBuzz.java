package com.shifted.finalalgo;

/**
 * Created by PaxoStudent on 1/11/2018.
 */
public class FizzBuzz {

    public static String fizzBuzz(int num){


        if( num % 5 == 0 && num % 3 == 0){

            return "Buzz";

        }else if( num % 5 == 0){

            return "Fizz";

        }else{

            return "fizzbuzz";
        }
    }

    public static void main(String[] args) {

        System.out.println(fizzBuzz(19));
    }
}
