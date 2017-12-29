package com.shifted.interview;

import java.util.ArrayList;

/**
 * Created by PaxoStudent on 10/31/2017.
 */
public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);

        System.out.println(al.get(2));

        System.out.println(al.size());
    }
}
