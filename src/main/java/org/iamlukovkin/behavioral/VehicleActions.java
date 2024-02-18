package org.iamlukovkin.behavioral;

public interface VehicleActions {
    String getRegistrationNumber();
    void setRegistrationNumber(String owner);
    void setVinNumber(int vinNumber);
    int getVinNumber();
    String getDrivingForceType();
    void setDrivingForceType(String drivingForceType);
    void makeTechnicalInspection();
    void repair();
    void fillUp(float fuel);
    void serve();
    void uniqueAction();

}
