package main.java.com.example.JDBC_SESSION8.exercise07;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Dùng 'var' cho gọn, giống 'const' trong TS
        var emp = new Employee("E01", "Nguyễn Văn A", 10000);
        var manager = new Manager("M01", "Trần Thị B", 20000, 5000);
        var dev = new Developer("D01", "Lê Văn C", 15000, "Java/TypeScript");

        System.out.println("--- THÔNG TIN BAN ĐẦU ---");
        // Trick: Gom tất cả vào 1 List (đều là Employee) để thể hiện rõ tính ĐA HÌNH
        var employees = List.of(emp, manager, dev);

        // Vòng lặp tự động gọi đúng hàm toString() của từng class con ở Runtime
        employees.forEach(e -> System.out.println(e.toString()));

        System.out.println("\n--- SAU KHI TĂNG LƯƠNG CHO DEVELOPER ---");
        dev.increaseSalary(2000);
        System.out.println(dev.toString());
    }
}