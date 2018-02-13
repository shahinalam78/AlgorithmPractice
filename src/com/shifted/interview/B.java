package com.shifted.interview;

public class B extends A {

    public static void main(String[] args) {

        A a = new A();

        System.out.println(a.x);

        a.c(10);
    }

    public void c(int x) {

        System.out.println(x);
    }

    public void c(int x, int y){

    }


}
