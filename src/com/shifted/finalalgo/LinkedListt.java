package com.shifted.finalalgo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListt {

    public static void main(String [] args){

        LinkedList<String> list = new LinkedList<>();

        list.add("alam");

        list.add("shathi");

        list.add("prioty");

        list.add("ahonaf");

        System.out.println("Linked List: " + list);

        Collections.reverse(list); // reverse list

        System.out.println(list);
    }
}
