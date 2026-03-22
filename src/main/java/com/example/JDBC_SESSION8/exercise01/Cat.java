package com.example.JDBC_SESSION8.exercise01;

// Extends đúng tên Animals
public class Cat extends Animals {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);

        if (furColor == null || furColor.trim().isEmpty()) {
            throw new IllegalArgumentException("Màu lông không được để trống.");
        }
        this.furColor = furColor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}