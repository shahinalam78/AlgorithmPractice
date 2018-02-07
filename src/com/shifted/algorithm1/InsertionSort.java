package com.shifted.algorithm1;
import java.util.Arrays;

/**
 * Created by PaxoStudent on 6/27/2017.
 */
public class InsertionSort {

    public static int[] insertionSort(int[] num){

       for(int i = 0; i < num.length; i++){

           for(int j = i; j > 0; j--){

               if(num[j] < num[j - 1]){

                   int temp = num[j];

                   num[j] = num[j - 1];

                   num[j - 1] = temp;
               }
           }

           System.out.println(Arrays.toString(num));
       }
        return num;
    }



    public static void main(String[] args) {

        int[] num = {34,2,5,78,30};

        System.out.println(Arrays.toString(insertionSort(num)));
    }
}
