package com.example.JDBC_SESSION8.exercise02;

public abstract class Vehicle {
    private String name;
    private int speed;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void start() {
        System.out.println(name + " is starting.");
    }

    public abstract void displayInfo();


}
