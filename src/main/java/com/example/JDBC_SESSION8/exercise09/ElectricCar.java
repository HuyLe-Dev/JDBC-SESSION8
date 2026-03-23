package main.java.com.example.JDBC_SESSION8.exercise09;

public class ElectricCar extends Car implements Refuelable {

    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        // Tái sử dụng getBaseInfo() từ lớp cha
        return "Xe điện %s đã khởi động không tiếng ồn.".formatted(getBaseInfo());
    }

    @Override
    public String stop() {
        return "Xe điện %s đã dừng và ngắt kết nối động cơ.".formatted(getBaseInfo());
    }

    @Override
    public void refuel() {
        // refuel là void nên ta dùng System.out.println luôn
        System.out.println("Xe điện %s đang sạc điện...".formatted(getBaseInfo()));
    }
}