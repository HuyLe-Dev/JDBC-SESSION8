package main.java.com.example.JDBC_SESSION8.exercise08;

public class Food extends Product {

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 5.0; // Thực phẩm giảm 5%
    }
}