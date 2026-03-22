package com.example.JDBC_SESSION8.exercise01;

public class Animals {
    private String name;
    private int age;

    // SỬA Ở ĐÂY: Tên Constructor phải là Animals (Có chữ s)
    public Animals(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void displayInfo() {
        System.out.printf("Tên: %s, Tuổi: %d%n", name, age);
    }

    public String makeSound() {
        return "Some generic sound";
    }

    // Getters & Setters
    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên động vật không được để trống.");
        }
        this.name = name;
    }

    public int getAge() { return age; }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Tuổi động vật không được là số âm.");
        }
        this.age = age;
    }
}