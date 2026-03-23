package main.java.com.example.JDBC_SESSION8.exercise09;

public class Main {
    public static void main(String[] args) {
        var garage = new Garage();

        // Đa hình: Truyền ElectricCar và GasCar vào List<Car>
        garage.addCar(new ElectricCar("Tesla Model S", 2023, 79990.50));
        garage.addCar(new GasCar("Toyota Camry", 2022, 25000.00));

        System.out.println("--- KHỞI ĐỘNG XE ---");
        garage.startAll();

        System.out.println("\n--- NẠP NHIÊN LIỆU ---");
        garage.refuelAll();

        System.out.println("\n--- TẮT ĐỘNG CƠ ---");
        garage.stopAll();
    }
}
