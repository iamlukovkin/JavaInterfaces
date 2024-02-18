package org.iamlukovkin.Vehicles.creational;

import org.iamlukovkin.Vehicles.structural.NonEngineVehicle;

public class Bicycle extends NonEngineVehicle {
    public Bicycle(String mark, String model, String owner) {
        super(mark, model, owner);
    }

    @Override
    public void uniqueAction() {
        System.out.println("Катаемся на велосипеде");
    }

    @Override
    public String toString() {
        return "Велосипед " + super.toString();
    }
}
