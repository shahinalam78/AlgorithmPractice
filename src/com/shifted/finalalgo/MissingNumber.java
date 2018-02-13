package com.shifted.finalalgo;

public class MissingNumber {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 6, 7};

        int sum = 0;

        for (int i = 0; i <= num.length - 1; i++) {

            sum = sum + num[i];
        }

        int sum1 = 0;

        for (int j = 1; j <= 7; j++) {

            sum1 = sum1 + j;
        }

        System.out.println(sum1 - sum);

    }
}