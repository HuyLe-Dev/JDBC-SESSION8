package main.java.com.example.JDBC_SESSION8.exercise09;

public abstract class Car {
    private final String model;
    private final int year;
    private final double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Các phương thức abstract bắt buộc lớp con phải triển khai
    public abstract String start();

    public abstract String stop();

    /**
     * (DRY):
     * Thay vì để lớp con gọi model, year, price rồi tự format lặp đi lặp lại,
     * lớp cha cung cấp sẵn một chuỗi định dạng chuẩn (protected để lớp con dùng).
     */
    protected String getBaseInfo() {
        // Sử dụng .formatted() (Java 15+) thay cho String.format() truyền thống
        return "%s (Năm SX: %d, Giá: $%,.2f)".formatted(model, year, price);
    }
}