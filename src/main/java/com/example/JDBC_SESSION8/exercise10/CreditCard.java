package main.java.com.example.JDBC_SESSION8.exercise10;

public class CreditCard extends PaymentMethod {

    public CreditCard(double amount) {
        super(amount); // Gọi constructor của lớp cha
    }

    @Override
    public double calculateFee() {
        return getAmount() * 0.02; // Phí 2%
    }

    @Override
    public double processPayment() {
        return getAmount() + calculateFee();
    }

    @Override
    public String processPayment(String currency) {
        // String.format tương đương với Template Literals (`${val} ${currency}`) trong TS
        return String.format("%,.2f %s", processPayment(), currency);
    }
}