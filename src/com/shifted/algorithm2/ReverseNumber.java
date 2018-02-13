package com.shifted.algorithm2;

/**
 * Created by PaxoStudent on 8/22/2017.
 */
public class ReverseNumber {

    public static void main(String[] args) {

       // System.out.println(reverseNumber(123456789));

      //  System.out.println(reverseNumbers(987654321));

        System.out.println(rreveseNumber(987654321));
    }

    public static int reverseNumber(int num) {

        int rnum = 0;

        while (num != 0) {

           rnum = rnum * 10;  // rnum = 0*10

            rnum = rnum + num % 10; // rnum = 0 + 123456789 % 10 = 9

            num = num / 10;  // num = 123456789 / 10 = 12345678
        }

        return rnum;
    }


    public static int reverseNumbers(int num) {

        int rnum = 0;

        while ( num != 0) {

            rnum = rnum * 10;

            rnum = rnum + num % 10;

            num = num / 10;

        }

        return rnum;
    }

    public static int rreveseNumber(int num){

        int rnum = 0;

        while(num != 0){

            rnum = rnum * 10 + num % 10;

            num = num / 10;
        }

        return rnum;

    }
}
