package com.shifted.excdption.handling;

/**
 * Created by PaxoStudent on 7/24/2017.
 */
public class Un_Checked_Exception {

    public static void main(String[] args) {

        // 1. Exmaple
        try {
            System.out.println("exception handling");
            System.out.println("exception handling");
            System.out.println(10 / 0); // ArithmeticException

        } catch (ArithmeticException ex) {

            System.out.println(ex.getMessage());
        }
        // rest of code r not executed

        System.out.println("exception handling");
        System.out.println("exception handling");

        // 2. Exmaple

        /*int [] a = {10,20,30,40,50};

        System.out.println(a[1]);

        System.out.println(a[10]); // ArrayIndexOutOfBoundsException

        // rest of code r not executed

        System.out.println(a[0]);

        System.out.println(a[3]);*/


        // 3. Exmaple

       /* String text = "this is string";

        System.out.println(text.charAt(4));

        System.out.println(text.charAt(40)); // StringIndexOutOfBoundsException

        // rest of code r not executed

        System.out.println(text.charAt(6));*/


        // 4. Exmaple

        // rule : java not support multiple catch block

       /* String text = "this is string";

        try {
            System.out.println(text.charAt(0));

            System.out.println(text.charAt(40)); // StringIndexOutOfBoundsException

        } catch (Exception ex){

            System.out.println(ex.getMessage());

        } finally {

            System.out.println(text.charAt(6));
        }*/
        // rest of code r not executed


    }
}
