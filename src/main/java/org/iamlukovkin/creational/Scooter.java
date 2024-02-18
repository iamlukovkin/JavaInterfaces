package org.iamlukovkin.creational;

import org.iamlukovkin.structural.NonEngineVehicle;

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
