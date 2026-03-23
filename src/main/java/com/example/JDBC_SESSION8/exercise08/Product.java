package main.java.com.example.JDBC_SESSION8.exercise08;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Phương thức này sinh ra để các lớp con ghi đè.
    public double getDiscount() {
        return 0.0; // Mặc định không chiết khấu
    }

    public double getFinalPrice() {
        // Công thức: Giá gốc - (Giá gốc * Chiết khấu / 100)
        // Lưu ý: Từ khóa 'this.getDiscount()' ở đây sẽ kích hoạt tính Đa hình (Polymorphism).
        // Nếu object thực tế là Electronics, nó sẽ gọi getDiscount() của Electronics, không phải của Product.
        return this.price - (this.price * this.getDiscount() / 100);
    }

    // --- OVERLOADING (NẠP CHỒNG) ---
    // Cùng tên hàm getDiscount, nhưng khác tham số đầu vào (int quantity)
    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 5.0; // Ép chiết khấu 5% cho mọi sản phẩm nếu mua > 100
        }
        return this.getDiscount(); // Trở về gọi hàm mặc định (không có tham số)
    }

    // Cùng tên hàm getFinalPrice, nhưng có tham số
    public double getFinalPrice(int quantity) {
        double discountRate = this.getDiscount(quantity);
        return this.price - (this.price * discountRate / 100);
    }
}