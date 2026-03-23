package main.java.com.example.JDBC_SESSION8.exercise10;

public class Cash extends PaymentMethod {

    public Cash(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return 0.0; // Miễn phí
    }

    @Override
    public double processPayment() {
        return getAmount() + calculateFee();
    }

    @Override
    public String processPayment(String currency) {
        return String.format("%,.2f %s", processPayment(), currency);
    }
}