package com.shifted.algorithm2;

/**
 * Created by PaxoStudent on 8/21/2017.
 */
public class ReverseString {

    public static void main(String[] args) {

        // System.out.println(reverseString("alam"));

        //System.out.println(reverseSttring("123456789"));

        // System.out.println(reverseText("new york"));

        // System.out.println(reverseTextt("jamaica"));

        // System.out.println(revString("mdalam"));

        //System.out.println(rrevString("new york"));

       // System.out.println(revStrring("new york"));

      //  System.out.println(revSstring("jamaica"));

        System.out.println( rrrString("abcdefg"));

    }

    public static String reverseString(String text) {

        String reversestring = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            reversestring = reversestring + text.charAt(i);
        }

        return reversestring;
    }


// using String Buffer Class

    public static String reverseSttring(String text) {

        String reversestring = "";

        StringBuffer buffer = new StringBuffer(text);

        reversestring = reversestring + buffer.reverse();

        return reversestring;
    }


    public static String reverseText(String text) {

        String reverseText = "";

        StringBuffer sb = new StringBuffer(text);

        reverseText = reverseText + sb.reverse();

        return reverseText;
    }


    public static String reverseTextt(String text) {

        String reverseString = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            reverseString = reverseString + text.charAt(i);
        }

        return reverseString;
    }

    public static String revString(String text) {

        String rString = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            rString = rString + text.charAt(i);
        }

        return rString;
    }

    public static String rrevString(String text) {

        String rString = "";

        StringBuffer sb = new StringBuffer(text);

        rString = rString + sb.reverse();

        return rString;
    }

    public static String revStrring(String text) {

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

        return new String(chars);
    }

    public static String revSstring(String text) {

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

    public static String rrrString(String text){

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
