package main.java.com.example.JDBC_SESSION8.exercise03;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng
        var circle = new Circle(5.0);
        var rectangle = new Rectangle(4.0, 5.0);
        var square = new Square(3.0);

        // 2. Thiết lập màu sắc
        circle.setColor("Red");
        rectangle.setColor("Blue");
        square.setColor("Green");

        // 3. In kết quả (Áp dụng Iterable và Reflection cơ bản)
        // Thay vì 3 dòng System.out.println rải rác, hãy gom chúng lại và duyệt qua
        // (List.of)
        var shapes = List.of(circle, rectangle, square);

        shapes.forEach(shape ->
        // Dùng getClass().getSimpleName() để lấy tên class linh động (VD: 'Circle')
        // Giống constructor.name trong JS/TS.
        System.out.printf("%s color: %s%n", shape.getClass().getSimpleName(), shape.getColor()));
    }

}
