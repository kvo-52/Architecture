package ru.gb.lesson03_task02;

public class OpenClosedPrinc_SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }

        return 0.0;
    }
}
public class Vehicle {
    int maxSpeed;
    String type;
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }
}
