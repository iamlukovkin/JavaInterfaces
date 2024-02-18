package org.iamlukovkin.behavioral;

public interface NonEngineVehicleActions extends VehicleActions {
    @Override
    default String getRegistrationNumber() {
        return "Это средство не может иметь регистрационный номер";
    }

    @Override
    default void setRegistrationNumber(String registrationNumber) {
        System.out.println(getRegistrationNumber());
    }

    default int getVinNumber() {
        System.out.println("Это средство не может иметь VIN номер");
        return 0;
    }

    @Override
    default void setVinNumber(int vinNumber) {
        System.out.println("Это средство не может иметь VIN номер");
    }

    @Override
    default String getDrivingForceType() {
        return "У данного средства нет типа движущей силы";
    }

    @Override
    default void setDrivingForceType(String drivingForceType) {
        System.out.println(getDrivingForceType());
    }


    default void fillUp(float fuel) {
        System.out.println("Это средство не может заправляться");
    }

    default void makeTechnicalInspection() {
        System.out.println("Это средство не может проходить технический осмотр");
    }

    @Override
    default void repair() {
        System.out.println("Ремонт транспорта без двигателя...");
    }

    @Override
    default void serve() {
        System.out.println("Обслуживание транспорта без двигателя...");
    }
}
