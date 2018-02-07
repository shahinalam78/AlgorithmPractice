package com.shifted.algorithm2;

/**
 * Created by PaxoStudent on 8/22/2017.
 */
public class Palindrome {


    public static void main(String[] args) {

        // System.out.println(isPalindrom("mom"));

        // System.out.println(isPalidroom("madam"));

       // System.out.println(isPalidrom("mom"));

        System.out.println(iisPalindrom("ny york"));
    }

    public static boolean isPalindrom(String text) {

        char[] charArray = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i) {

            if (charArray[j] != charArray[i]) {

                return false;
            }

            i++;

            j--;

        }

        return true;
    }


    public static boolean isPalidroom(String text) {

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i) {

            if (chars[j] != chars[i]) {

                return false;

            }

            i++;

            j--;
        }

        return true;
    }


    public static boolean isPalidrom(String text) {

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i) {

            if (chars[j] != chars[i]) {

                return false;
            }

            i++;

            j--;
        }

        return true;

    }


    public static boolean iisPalindrom(String text) {

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length() - 1;

        while (j > i) {

            if (chars[j] != chars[i]) {

                return false;
            }

            i++;

            j--;
        }

        return true;
    }
}
