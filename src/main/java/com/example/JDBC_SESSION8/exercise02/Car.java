package com.example.JDBC_SESSION8.exercise02;

public class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed); // Đẩy dữ liệu lên cho constructor của lớp cha xử lý
    }

    // Bắt buộc phải Override hàm này, nếu không sẽ bị báo lỗi Compile
    @Override
    public void displayInfo() {
        // Phải dùng getName() và getSpeed() vì name, speed ở lớp cha là private
        System.out.printf("Car Name: %s, Speed: %d km/h%n", getName(), getSpeed());
    }
}
