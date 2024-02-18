package org.iamlukovkin.Vehicles.behavioral;

public interface EngineVehicleActions extends VehicleActions {
    @Override
    default void fillUp(float fuel) {
        System.out.println("Заправляемся... на " + fuel + " литров");
    }

    @Override
    default void makeTechnicalInspection() {
        System.out.println("Проверяем двигатель и трансмиссию");
    }

    @Override
    default void repair() {
        System.out.println("Ремонтируем двигатель");
    }

    @Override
    default void serve() {
        System.out.println("Обслуживание двигателя");
    }

    void uniqueAction();
}
