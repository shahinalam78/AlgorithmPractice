package com.shifted.rstring;

/**
 * Created by PaxoStudent on 11/24/2017.
 */
public class ReverseString extends forloop{

    public static String rString(String text){

        char[] chars = text.toCharArray();

        int i = 0;

        int j = text.length()-1;

        while (j > i){

            char temp = chars[i];

            chars[i] = chars[j];

            chars[j] = temp;

            i++;

            j--;

        }

        return new String(chars);
    }

    public static String rrString(String text){

        String rString = "";

        for(int i = text.length()-1; i >= 0; i--){

            rString = rString + text.charAt(i) ;
        }

        return rString;
    }

    public static String rrrString(String text){

        String rString = "";

        StringBuffer sb = new StringBuffer(text);

        rString = rString + sb.reverse();

        return rString;

    }



    public static void main(String[] args) {

       // System.out.println(rString("jamaica"));

       // System.out.println(rrString("new york"));

        System.out.println(rrrString("Jackson Height"));
    }



}
