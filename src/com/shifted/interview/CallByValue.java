package com.shifted.interview;

/**
 * Created by PaxoStudent on 10/25/2017.
 */
public class CallByValue {

    int data = 10;

    void change(int data){

        data = data + 100;
    }

    public static void main(String[] args) {

        CallByValue op = new CallByValue();

        System.out.println("Before Change = " + op.data);

        op.change(500);

        System.out.println("After Change = " + op.data);
    }
}
