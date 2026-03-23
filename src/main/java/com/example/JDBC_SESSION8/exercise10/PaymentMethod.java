package main.java.com.example.JDBC_SESSION8.exercise10;

public abstract class PaymentMethod {
    private final double amount;

    public PaymentMethod(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Số tiền không hợp lệ");
        }
        this.amount = amount;
    }

    // Cung cấp Getter để lớp con lấy dữ liệu thay vì để 'protected double amount'
    protected double getAmount() {
        return amount;
    }

    // Các hành vi mà lớp con BẮT BUỘC phải tự định nghĩa
    public abstract double calculateFee();
    public abstract double processPayment();
    
    // Nạp chồng (Overloading) phương thức processPayment
    public abstract String processPayment(String currency);
}