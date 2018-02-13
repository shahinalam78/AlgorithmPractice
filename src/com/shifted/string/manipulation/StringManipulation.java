package com.shifted.string.manipulation;

import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 * Created by PaxoStudent on 9/13/2017.
 */
public class StringManipulation {

    public static void main(String[] args) {

        //System.out.println(inUpLowCase("my name is"));

       // System.out.println(subString("jamaica"));

       // System.out.println(upLowCase("my name is"));

       // System.out.println(numSep("dhjk79kjl78m111jk"));

        System.out.println(stringSep("jlkjg l788 mnlf 988"));
    }

    public static String inUpLowCase(String text) {

        String[] newText = text.split(" ");

        String firstLetter = newText[0].toUpperCase();

        String vb = (firstLetter + " name is");

        return vb;

    }

    //substring()

    public static String subString(String text) {

        String substring = new String(text);

        String result = substring.substring(2, 4);

       // String result = substring.substring(1);

        return result;
    }


// split()
    public static String upLowCase(String text){

        String [] newText = text.split(" ");

        String vb = ("my " + newText[1].toUpperCase() + " is");

        return vb;
    }


    //replaceAll()

    public static int numSep(String text){

       String  num = text.toUpperCase().replaceAll("[^0-9]","");

        int numm = Integer.parseInt(num);

        return numm;

    }

    public static String stringSep(String text){

        //String string = text.toUpperCase().replaceAll("[^A-Z]","");

        String string = text.replace("l788","988");

        return string;

    }



}
