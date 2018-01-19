package com.shifted.OOP;

/**
 * Created by PaxoStudent on 12/28/2017.
 */
public class Test {

    public static void main(String[] args) {

        CityBank city = new CityBank();

        HsbcBank hsbc = new HsbcBank();

        Chase chase = new Chase();

        System.out.println("City bank interset is: " + city.getRateOfInterest());

        System.out.println("Hsbc bank interset is: " + hsbc.getRateOfInterest());

        System.out.println("Chase bank interset is: " + chase.getRateOfInterest());
    }
}
