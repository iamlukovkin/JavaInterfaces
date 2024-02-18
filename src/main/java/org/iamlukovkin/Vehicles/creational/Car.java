package org.iamlukovkin.Vehicles.creational;

import org.iamlukovkin.Vehicles.structural.EngineVehicle;

public class Car extends EngineVehicle {
    public Car(String mark, String model, String owner, int numberVin, String registrationNumber, String drivingForceType) {
        super(mark, model, owner, numberVin, registrationNumber, drivingForceType);
    }

    @Override
    public void uniqueAction() {
        System.out.println("Дрифтуем!");
    }

    @Override
    public void repair() {
        System.out.println("Ремонтируем руль");
    }

    @Override
    public void serve() {
        System.out.println("Крутим колеса");
    }

    @Override
    public String toString() {
        return "Авто: " + super.toString();
    }
}
