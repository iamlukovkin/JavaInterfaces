package org.iamlukovkin.structural;

import org.iamlukovkin.behavioral.NonEngineVehicleActions;

abstract public class NonEngineVehicle extends Vehicle implements NonEngineVehicleActions {
    public NonEngineVehicle(String mark, String model, String owner) {
        super(mark, model, owner);
    }
}
