package org.iamlukovkin.Vehicles.structural;

import org.iamlukovkin.Vehicles.behavioral.NonEngineVehicleActions;

abstract public class NonEngineVehicle extends Vehicle implements NonEngineVehicleActions {
    public NonEngineVehicle(String mark, String model, String owner) {
        super(mark, model, owner);
    }
}
