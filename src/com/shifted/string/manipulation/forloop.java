package com.shifted.string.manipulation;

/**
 * Created by PaxoStudent on 12/28/2017.
 */
public class forloop {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            if(i % 2 == 0){

                System.out.println("Even Number: " + i);

            } else if (i % 2 == 1){

                System.out.println("Odd Number: " + i);
            }
        }
    }
}
