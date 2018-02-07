package com.shifted.abstraction.interfacee;

/**
 * Created by PaxoStudent on 1/23/2018.
 */
public class TestBank {

    public static void main(String[] args) {

       Bank bank = new HSBC();

        System.out.println("Interest for HSBC: " + bank.getBankInterest() + "%");

        Bank bankk = new Chase();

        System.out.println("Interest for Chase: " + bankk.getBankInterest() + "%");
    }
}
