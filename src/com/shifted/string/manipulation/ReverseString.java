package com.shifted.string.manipulation;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println(rString(text));
    }

    public static String rString(String text){

      char[] chars = text.toCharArray();

      int i = 0;

      int j = text.length()-1;

      while(j > i){

          char temp = chars[i];

          chars[i] = chars[j];

          chars[j] = temp;

          i++;

          j--;
      }

      return new String(chars);

    }
}
