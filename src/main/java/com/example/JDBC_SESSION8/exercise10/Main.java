package main.java.com.example.JDBC_SESSION8.exercise10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double baseAmount = 1000000; // 1 triệu

        // Sử dụng Đa hình: Mảng chứa lớp Cha, nhưng khởi tạo bằng lớp Con
        var payments = List.of(
            new CreditCard(baseAmount),
            new DebitCard(baseAmount),
            new Cash(baseAmount)
        );

        System.out.println("=== MÔ PHỎNG GIAO DỊCH VỚI SỐ TIỀN: " + String.format("%,.0f", baseAmount) + " ===");

        // Duyệt qua từng phương thức thanh toán bằng Stream API
        payments.forEach(payment -> {
            System.out.printf("\nPhương thức: %s%n", payment.getClass().getSimpleName());
            System.out.printf("- Phí giao dịch: %,.2f%n", payment.calculateFee());
            System.out.printf("- Tổng phải trả (Số): %,.2f%n", payment.processPayment());
            System.out.printf("- Tổng phải trả (Chuỗi): %s%n", payment.processPayment("VND"));
        });
    }
}