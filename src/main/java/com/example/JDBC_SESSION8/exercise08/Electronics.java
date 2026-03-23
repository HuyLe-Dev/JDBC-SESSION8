package main.java.com.example.JDBC_SESSION8.exercise08;

public class Electronics extends Product {
    
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 10.0; // Điện tử giảm 10%
    }
}