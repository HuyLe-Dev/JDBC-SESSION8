package com.example.JDBC_SESSION8.exercise02;

public class Bike extends Vehicle {

    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Bike Name: %s, Speed: %d km/h%n", getName(), getSpeed());
    }
}
