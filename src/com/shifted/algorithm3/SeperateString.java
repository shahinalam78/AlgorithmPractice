package com.shifted.algorithm3;

/**
 * Created by PaxoStudent on 8/26/2017.
 */
public class SeperateString {

    public static void main(String[] args) {

       // System.out.println(sString("yu787b7bui997"));

        System.out.println(sssss("yu787b7bui997"));

    }

    public static int sString(String text){

        String string = text.toUpperCase().replaceAll("[^0-9]","");

        int value = Integer.parseInt(string);

        return value;
    }

    public static String sssss(String text){

        String string = text.replaceAll("[^a-z]","");

        return string;
    }
}
