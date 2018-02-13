package com.shifted.algorithm3;

/**
 * Created by PaxoStudent on 8/26/2017.
 */
public class ReverseNumber {

    public static void main(String[] args) {

      //  System.out.println(reverseNumber(54321));

       // System.out.println(rreverseNumber(456789));

        System.out.println(rString("jamaica"));
    }

    public static int reverseNumber(int num) {

     int rnum = 0;

     while (num != 0){

         rnum = rnum*10;

         rnum = rnum + num % 10;

         num = num / 10;
     }

     return rnum;

    }

    public static int rreverseNumber(int num){

        int rnum = 0;

        while (num != 0){

            rnum = rnum * 10;

            rnum = rnum + num % 10;

            num = num / 10;
        }

        return rnum;
    }


    public static String rString(String text){

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i){

            char temp = chars[i];

            chars[i] = chars[j];

            chars[j] = temp;

            i++;

            j--;

        }

        return new String(chars);

    }

}
