package com.shifted.algorithm1;
import java.util.Arrays;

/**
 * Created by PaxoStudent on 6/27/2017.
 */

/** What is Bubbule Sort...???
  arr[0] < arr[1] < arr[2] < … … … … … … < arr [n – 2] < arr[n – 1]
 OR
 arr[1] > arr[2] > … … … … … … > arr [n – 2] > arr[n – 1].
 */

public class BubbleSort {

    public static int[] bubbleSort(int[] nums) {

        for (int i = 0; i <= nums.length -1 ; i++) {

            for (int j = nums.length -1; j > i; j--) {

                if (nums[j] < nums[j - 1]) {

                    //swap(nums, j, j - 1);

                    int temp = nums[j];

                    nums[j] = nums[j - 1];

                    nums[j - 1] = temp;
                }

                System.out.println(Arrays.toString(nums));

            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {34, 56, 2, 60, 23};

        System.out.println("Before Sort..");
        System.out.println(Arrays.toString(nums));

        System.out.println("After Sort..");
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}
