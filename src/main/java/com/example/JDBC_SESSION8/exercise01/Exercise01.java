package com.example.JDBC_SESSION8.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        try {
            // Khai báo List chuẩn xác theo kiểu Animals
            List<Animals> animalsList = new ArrayList<>();
            animalsList.add(new Dog("Buddy", 3, "Golden Retriever"));
            animalsList.add(new Cat("Whiskers", 2, "Ghi"));

            for (Animals animal : animalsList) {
                animal.displayInfo();
                System.out.println("Âm thanh: " + animal.makeSound());
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Lỗi dữ liệu: " + e.getMessage());
        }
    }
}