package com.example.JDBC_SESSION8.exercise02;

public class Exercise02 {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Nbox", 120);
        Vehicle myBike = new Bike("Honda", 80);

        myCar.start();
        myCar.displayInfo();

        myBike.start();
        myBike.displayInfo();
    }
}
