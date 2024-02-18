package org.iamlukovkin.Vehicles.creational;

import org.iamlukovkin.Vehicles.structural.EngineVehicle;

public class QuadroBike extends EngineVehicle {
    public QuadroBike(String mark, String model, String owner, int numberVin, String registrationNumber, String drivingForceType) {
        super(mark, model, owner, numberVin, registrationNumber, drivingForceType);
    }

    @Override
    public void uniqueAction() {
        System.out.println("Катаемся по бездорожью");
    }

    @Override
    public String toString() {
        return "Квадроцикл " + super.toString();
    }
}
