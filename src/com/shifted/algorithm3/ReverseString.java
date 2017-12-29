package com.shifted.algorithm3;

/**
 * Created by PaxoStudent on 8/26/2017.
 */
public class ReverseString {

    public static void main(String[] args) {

       // System.out.println(reverseString("new york"));

       // System.out.println(rreverString("jamaica"));

       // System.out.println(rverString("alam"));

        System.out.println(rreverString("new jersey"));
    }

    public static String reverseString(String text) {

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

    public static String rreverString(String text){

        String rString = "";

        for(int i = text.length()-1; i >= 0; i--){

            rString = rString + text.charAt(i);
        }

        return rString;
    }


    public static String rverString(String text){

        String reveseString = "";

        StringBuffer sb = new StringBuffer(text);

        reveseString = reveseString + sb.reverse();

        return reveseString;

    }

    public static String rrverStirng (String text){

       char [] chars = text.toCharArray();

       int j = text.length() - 1;

       int i = 0;

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
