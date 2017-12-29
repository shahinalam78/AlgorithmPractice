package com.shifted.algorithm1;

/**
 * Created by PaxoStudent on 6/22/2017.
 */
public class ReverseString {

    public static char[] reverseString(String text) {

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i) {

            char temp = chars[i];

            chars[i] = chars[j];

            chars[j] = temp;

            j--;

            i++;
        }

        return chars;
    }

    public static void main(String[] args) {

        String text = "shahin";

        System.out.println(reverseString(text));
    }
}
