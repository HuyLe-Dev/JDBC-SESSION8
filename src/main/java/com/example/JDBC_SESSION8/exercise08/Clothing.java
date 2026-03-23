package main.java.com.example.JDBC_SESSION8.exercise08;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 20.0; // Quần áo giảm 20%
    }
}