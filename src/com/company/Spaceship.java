package com.company;

public class Spaceship
{
    private String shipName;
    private int passengercount;

    public Spaceship (String shipName)
    {
        this.shipName = shipName;
        this.passengercount = 0;
    }

    public void addPassenger()
    {
        this.passengercount++;
    }

    public void removePassenger()
    {
        this.passengercount--;
    }

    public void removeAllPassenger()
    {
        int removed = 0;
        this.passengercount = removed;
    }

    public String getShipDescription()
    {
        String shipDescription = "The " + this.shipName + " is carrying " + this.passengercount + " passengers.";
        return shipDescription;
    }
}
