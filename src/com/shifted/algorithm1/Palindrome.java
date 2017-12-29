package com.shifted.algorithm1;

/**
 * Created by PaxoStudent on 6/24/2017.
 */
public class Palindrome {

    public static boolean isPalindrome(String text) {

        char[] textArray = text.toCharArray(); // convert String to char[]

        int i = 0; // start from index 0

        int j = text.length() - 1; // last index

        while (j > i) {

            if (textArray[j] != textArray[i]) {   // if [j] and [i] not equal then return false

                return false;
            }

            i++;

            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        // String text = "mom";

        String text = "alam";

        System.out.println(text);
    }
}
