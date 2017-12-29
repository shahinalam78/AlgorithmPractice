package com.shifted.algorithm1;

import java.util.Scanner;

/**
 * Created by PaxoStudent on 6/22/2017.
 */
public class ReverseNumber {

    public static int reverseNumber(int num) {

        int rnum = 0;

        while (num != 0) {

            rnum = rnum * 10;

            rnum = rnum + num % 10;

            num = num / 10;
        }

        return rnum;
    }

    public static void main(String[] args) {

        System.out.println("Please Enter Your Number: ");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.print("Reverse Number is: " + reverseNumber(num));
    }

    /*
    rnum = rnum % 10

rnum = 9875 % 10 = 5

rnum = rnum * 10 + Reminder

rnum = 0 * 10 + 5

rnum = 5

num = num  / 10

num = 9875 /10

num = 987
     */


}
