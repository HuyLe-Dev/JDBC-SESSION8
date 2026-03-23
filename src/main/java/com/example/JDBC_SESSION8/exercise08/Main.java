package main.java.com.example.JDBC_SESSION8.exercise08;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng
        var genericProduct = new Product("Sản phẩm chung", 1000);
        var laptop = new Electronics("Laptop Dell", 1000);
        var shirt = new Clothing("Áo thun Polo", 1000);
        var apple = new Food("Táo Mỹ", 1000);

        // Gom vào List để xử lý hàng loạt
        var products = List.of(genericProduct, laptop, shirt, apple);

        System.out.println("=== KIỂM TRA MUA LẺ (Mặc định) ===");
        products.forEach(p -> System.out.printf("Sản phẩm: %-15s | Giá gốc: %,.0f | Giá sau C/K: %,.0f (C/K: %.0f%%)%n",
                p.getName(), p.getPrice(), p.getFinalPrice(), p.getDiscount()));

        System.out.println("\n=== KIỂM TRA MUA SỈ (Số lượng > 100) ===");
        int bulkQuantity = 150;
        products.forEach(p -> System.out.printf("Sản phẩm: %-15s | Giá gốc: %,.0f | Giá sau C/K: %,.0f (C/K: %.0f%%)%n",
                p.getName(), p.getPrice(), p.getFinalPrice(bulkQuantity), p.getDiscount(bulkQuantity)));
    }
}
