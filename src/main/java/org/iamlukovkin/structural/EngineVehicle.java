package org.iamlukovkin.structural;

import org.iamlukovkin.behavioral.EngineVehicleActions;

abstract public class EngineVehicle extends Vehicle implements EngineVehicleActions {
    private int numberVin;
    private String registrationNumber;
    private String drivingForceType;

    public EngineVehicle(String mark, String model, String owner, int numberVin, String registrationNumber, String drivingForceType) {
        super(mark, model, owner);
        setVinNumber(numberVin);
        setRegistrationNumber(registrationNumber);
        setDrivingForceType(drivingForceType);
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public int getVinNumber() {
        return numberVin;
    }

    @Override
    public String getDrivingForceType() {
        return drivingForceType;
    }

    @Override
    public void setRegistrationNumber(String owner) {
        this.registrationNumber = owner;
    }

    @Override
    public void setVinNumber(int vinNumber) {
        this.numberVin = vinNumber;
    }

    @Override
    public void setDrivingForceType(String drivingForceType) {
        this.drivingForceType = drivingForceType;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nНомер VIN: " + getVinNumber() + ", \nРегистрационный номер: " + getRegistrationNumber() + ", \nТип двигателя: " + getVinNumber() + ", \nТип привода: " + getDrivingForceType();
    }
}
