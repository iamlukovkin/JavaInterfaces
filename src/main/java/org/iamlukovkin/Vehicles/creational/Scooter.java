package org.iamlukovkin.Vehicles.creational;

import org.iamlukovkin.Vehicles.structural.NonEngineVehicle;

public class Scooter extends NonEngineVehicle {
    public Scooter(String mark, String model, String owner) {
        super(mark, model, owner);
    }

    @Override
    public void uniqueAction() {
        System.out.println("Скатимся на самокате");
    }

    @Override
    public String toString() {
        return "Самокат " + super.toString();
    }
}
