package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Spaceship spaceship = new Spaceship("NSEA Protector");

        System.out.println(spaceship.getShipDescription());

        spaceship.addPassenger();
        spaceship.addPassenger();
        spaceship.addPassenger();
        spaceship.addPassenger();
        System.out.println(spaceship.getShipDescription());

        spaceship.removePassenger();
        System.out.println(spaceship.getShipDescription());

        spaceship.removeAllPassenger();
        System.out.println(spaceship.getShipDescription());


    }
}
