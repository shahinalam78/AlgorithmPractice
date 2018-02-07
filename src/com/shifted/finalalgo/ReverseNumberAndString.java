package com.shifted.finalalgo;

/**
 * Created by PaxoStudent on 1/11/2018.
 */
public class ReverseNumberAndString {

    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);

      int  num =  sc.nextInt();*/

        // System.out.println(reverseNumber(123456789));

        // System.out.println(rverseString("jamaica"));

       // System.out.println(rrverseString("jamaica"));

        System.out.println(rrrverseString("new york"));
    }

    public static int reverseNumber(int num) {

        int rev = 0;

        while (num != 0) {

            rev = rev * 10 + num % 10;

            num = num / 10;
        }

        return rev;
    }


    public static String rverseString(String text) {

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i) {

            char temp = chars[i];

            chars[i] = chars[j];

            chars[j] = temp;

            i++;

            j--;
        }

        return new String(chars);
    }


    public static String rrverseString(String text) {

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            reverse = reverse + text.charAt(i);
        }

        return reverse;
    }


    public static String rrrverseString(String text) {

        String reverse = "";

        StringBuffer bf = new StringBuffer(text);

        reverse = reverse + bf.reverse();

        return reverse;
    }

}






