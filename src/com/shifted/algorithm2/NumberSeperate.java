package com.shifted.algorithm2;

import java.util.Scanner;

/**
 * Created by PaxoStudent on 8/22/2017.
 */
public class NumberSeperate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();


        // String text = "djhf7398nkjh78";

        // System.out.println(numberSeperate(text));

        System.out.println(numberseperrate(text));

    }

    public static String numberSeperate(String text) {

        // String newString = text.toUpperCase().replaceAll("[^A-Z]","");

        String newString = text.toUpperCase().replaceAll("[^0-9]", "");

        return newString;
    }


    public static int numberseperrate(String text) {

        String newString = text.replaceAll("[^0-9]", "");

        int value = Integer.parseInt(newString);

        return value;
    }
}
