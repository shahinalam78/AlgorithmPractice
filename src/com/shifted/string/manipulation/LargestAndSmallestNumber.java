package com.shifted.string.manipulation;

import java.util.Arrays;

/**
 * Created by PaxoStudent on 1/9/2018.
 */
public class LargestAndSmallestNumber {

    public static void largeAndSmall(int[] num) {

       int largest = num[0];

        int smallest = num[0];

        for(int i = 0; i <= num.length-1; i++){

            if(num[i] > largest ){

                largest = num[i];

            } else if(num[i] < smallest){

                smallest = num[i];
            }
        }
        System.out.println("Largest Number Is:  " + largest);

        System.out.println("Smallest Number Is:  " + smallest);
    }

    public static void largesmall(int[] num){

        int largest = num[0];

        int smallest = num[0];

        for(int i = 0; i<num.length; i++){

            if(num[i] > largest){

               largest = num[i];

            } else if(num[i] < smallest){

                smallest = num[i];
            }
        }

        System.out.println("Larest Number Is: " + largest);

        System.out.println("Smallest Number Is: " + smallest);
    }

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 33, 58756,58757};

       // largeAndSmall(num);

        largesmall(num);

        System.out.println("Given Array Is: " + Arrays.toString(num));

    }
}