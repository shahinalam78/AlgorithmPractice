package com.shifted.finalalgo;

/**
 * Created by PaxoStudent on 1/11/2018.
 */
public class LargeAndSmallNumber {

    public static void largeSmall(int[] num) {

        int l = num[0];

        int s = num[0];

        for (int i = 0; i <= num.length - 1; i++) {

            if (num[i] > l) {

                l = num[i];

            } else if (num[i] < s) {

                s = num[i];
            }

        }

        System.out.println("Largest number is: " + l);

        System.out.println("Smallest Number is: " + s);

    }


    public static void laegrestSmall(int[] num) {

        int l = num[0];

        int s = num[0];

        for (int i = 0; i <= num.length - 1; i++) {

            if (num[i] > l) {

                l = num[i];

            } else if (num[i] < s) {

                s = num[i];
            }
        }

        System.out.println("Largest number is: " + l);

        System.out.println("Smallest Number is: " + s);
    }

    public static void main(String[] args) {

        int[] num = {0, 1, 76, 7682, 234, 234, 7865};

        // largeSmall(num);

        laegrestSmall(num);
    }
}
