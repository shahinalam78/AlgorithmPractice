package com.shifted.interview;

/**
 * Created by PaxoStudent on 8/17/2017.
 */
public class Interview {

    int x = 10; // instance variable
    int y = 40; // instance variable

   static int z = 50; // static variable

    static final int p = 100; // constant variable

    static  public void main(String[] args) {

        Interview t = new Interview();


        System.out.println(t.y);
        System.out.println(t.x);
        System.out.println(Interview.z);
        System.out.println(t.b());
    }

    // main method is possible to overload and declared final, like

   final public static void main(int y) {

    }

    public int b() {

        int g = y;

        return g;

    }
}
