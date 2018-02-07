package com.shifted.string.manipulation;

/**
 * Created by PaxoStudent on 1/9/2018.
 */
public class MissingNumber {

    public static int missingNumber(int[] x) {

        int sum = 0;

        for (int i = 1; i <= x.length; i++) {

            sum = sum + i;
        }

        return sum;
    }


    public static void main(String[] args) {

        int[] x = {1,2,3,5};

        System.out.println(missingNumber(x));
    }
}
