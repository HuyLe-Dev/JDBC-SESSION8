package main.java.com.example.JDBC_SESSION8.exercise09;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    // Dùng Composition: Garage CHỨA List các Car
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void startAll() {
        // Dùng Stream API và Method Reference (Giống array.forEach trong TS)
        cars.stream()
            .map(Car::start) // Gọi start() trả về String
            .forEach(System.out::println); // In ra console
    }

    public void stopAll() {
        cars.stream()
            .map(Car::stop)
            .forEach(System.out::println);
    }

    public void refuelAll() {
        cars.forEach(car -> {
            // Giống Type Guard trong TypeScript (if (car as Refuelable))
            if (car instanceof Refuelable r) {
                r.refuel(); // Ép kiểu an toàn ngầm định vào biến 'r'
            }
        });
    }
}