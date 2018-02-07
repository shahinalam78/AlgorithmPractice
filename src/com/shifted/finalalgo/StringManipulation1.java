package com.shifted.finalalgo;

import java.util.Arrays;

/**
 * Created by PaxoStudent on 1/11/2018.
 */
public class StringManipulation1 {

    public static void main(String[] args) {

        String st = "This is a String";

        String stt = "12kljkh67kj78";

        String date = "01/01/2018";

        int x = 1000;

        /*System.out.println(st.charAt(3)); //charAt()

        System.out.println(st.length()); //st.length()

        System.out.println(st.indexOf('S')); //indexOf()

        System.out.println(st.indexOf("is"));

        System.out.println(st.equals(stt)); // equals()

        System.out.println(st.substring(0,4)); //substring()*/

        //split()

       /* String[] word = st.split(" ");

        for(int i = 0; i <= word.length - 1; i++){

            System.out.println(word[i]);
        }*/


        // System.out.println(date.replaceAll("/","-")); //replaceAll()

        // System.out.println(st.replace(" ", ""));

        System.out.println(stt.replaceAll("[0-9]", "")); // replaceAll()

        // char[] chars = st.toCharArray();

        // System.out.println(Arrays.toString(chars)); //


        Integer y = Integer.valueOf(x); // valueOf()

        System.out.println(y);


    }
}
