package com.shifted.OOP;

/**
 * Created by PaxoStudent on 12/28/2017.
 */
public class Dog extends Cat {

    int y = 20;

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.test();
    }

    public void test(){

        System.out.println(this.y);

        System.out.println(super.x);

        super.test();
    }



}

