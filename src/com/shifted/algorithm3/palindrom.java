package com.shifted.algorithm3;

/**
 * Created by PaxoStudent on 8/26/2017.
 */
public class palindrom {

    public static void main(String[] args) {

        System.out.println(isPalindrom("mommmj"));

    }

    public static boolean isPalindrom(String text){

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i) {

            if (chars[j] != chars[i]) {

                return false;

            } else {

                i++;

                j--;
            }

        }

        return true;
    }
}
