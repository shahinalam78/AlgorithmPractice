package com.shifted.string.manipulation;

import java.util.Arrays;

/**
 * Created by PaxoStudent on 1/24/2018.
 */
public class StringManipulation2 {

    public static void main(String[] args) {

        String text = "This is a String";

        String textt = "this 88909hkm,m89";

        String data = "01/01/2018";

        int x = 100;

       // System.out.println(Arrays.toString(text.toCharArray()));

       // System.out.println(text.charAt(5));

       // System.out.println(text.length());

       // System.out.println(text.indexOf("is"));

       // System.out.println(text.contains("is"));

      //  System.out.println(text.substring(0,5));

     //   System.out.println(textt.replaceAll("[^0-9]",""));

       String[] word =  text.split(" ");

       for(int i = 0; i < text.length(); i++){

           System.out.println(word[i]);
       }


    }
}
