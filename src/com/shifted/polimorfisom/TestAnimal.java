package com.shifted.polimorfisom;

/**
 * Created by PaxoStudent on 1/23/2018.
 */
public class TestAnimal {

    public static void main(String[] args) {

        Animal animal;

        animal = new Animal();

        animal.eat();

        animal = new Dog();

        animal.eat();

        animal = new BabyDog(); // upcasting

        animal.eat();

        animal = new cat();

        animal.eat();

        Dog d = new cat(); // upcasing

        d.eat();


    }
}
