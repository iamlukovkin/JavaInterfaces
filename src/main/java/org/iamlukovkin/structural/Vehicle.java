package org.iamlukovkin.structural;

import org.iamlukovkin.behavioral.VehicleActions;

abstract public class Vehicle implements VehicleActions {
    private String mark;
    private String model;
    private String owner;

    public Vehicle(String mark, String model, String owner) {
        setMark(mark);
        setModel(model);
        setOwner(owner);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "\nМарка: " + getMark() + "\nМодель: " + getModel() + "\nВладелец: " + getOwner();
    }
}
