package main.java.com.example.JDBC_SESSION8.exercise09;

public class GasCar extends Car implements Refuelable {

    public GasCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return "Xe chạy xăng %s đã khởi động với tiếng động cơ.".formatted(getBaseInfo());
    }

    @Override
    public String stop() {
        return "Xe chạy xăng %s đã dừng và động cơ tắt.".formatted(getBaseInfo());
    }

    @Override
    public void refuel() {
        System.out.println("Xe chạy xăng %s đang được đổ xăng...".formatted(getBaseInfo()));
    }
}