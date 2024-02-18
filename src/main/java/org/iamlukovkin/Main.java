package org.iamlukovkin;

import org.iamlukovkin.Vehicles.creational.*;
import org.iamlukovkin.Vehicles.structural.Vehicle;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Trek", "Bianchi", "Lukovkin");
        Car car = new Car("BMW", "X5", "Lukovkin", 1234, "1234", "Petrol");
        MotorBike motorBike = new MotorBike("Honda", "Civic", "Lukovkin", 1235, "1235", "Diesel");
        QuadroBike quadroBike = new QuadroBike("Yamaha", "YBR", "Lukovkin", 1236, "1236", "Electric");
        Scooter scooter = new Scooter("Yamaha", "YBR", "Lukovkin");

        for (Vehicle vehicle : new Vehicle[]{bicycle, car, motorBike, quadroBike, scooter}) {
            System.out.println(vehicle.toString());
            vehicle.fillUp(15.0f);
            vehicle.repair();
            vehicle.serve();
            vehicle.makeTechnicalInspection();
            vehicle.uniqueAction();
            System.out.println();
        }
    }
}