package org.iamlukovkin.Vehicles.creational;

import org.iamlukovkin.Vehicles.structural.EngineVehicle;

public class MotorBike extends EngineVehicle {
    public MotorBike(String mark, String model, String owner, int numberVin, String registrationNumber, String drivingForceType) {
        super(mark, model, owner, numberVin, registrationNumber, drivingForceType);
    }

    @Override
    public void uniqueAction() {
        System.out.println("Покатаемся на одном колесе мотоцикла!");
    }

    @Override
    public String toString() {
        return "Мотоцикл " + super.toString();
    }
}
