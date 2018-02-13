package com.shifted.algorithm2;

/**
 * Created by PaxoStudent on 8/23/2017.
 */
public class OddEvenNumber {

    public static void main(String[] args) {

        System.out.println(oddEvenNum(19));

    }

    public static String oddEvenNum(int num){

        String evenNumber = "";

        String oddNumber = "";

        if(num % 2 == 0){

            return "evenNumber";

        } else {

            return "oddNumber";
        }
    }
}
