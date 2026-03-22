package com.example.JDBC_SESSION8.exercise01;

// Extends đúng tên Animals
public class Dog extends Animals {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Gọi lên constructor Animals(name, age)

        if (breed == null || breed.trim().isEmpty()) {
            throw new IllegalArgumentException("Giống chó không được để trống.");
        }
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống chó: " + breed);
    }

    @Override
    public String makeSound() {
        return "Woof Woof";
    }
}