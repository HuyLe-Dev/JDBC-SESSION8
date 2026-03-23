package main.java.com.example.JDBC_SESSION8.exercise10;

public class DebitCard extends PaymentMethod {

    public DebitCard(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return getAmount() * 0.01; // Phí 1%
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