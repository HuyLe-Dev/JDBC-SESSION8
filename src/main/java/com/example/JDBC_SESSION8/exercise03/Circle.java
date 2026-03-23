package main.java.com.example.JDBC_SESSION8.exercise03;

public class Circle implements Colorable {
    private final double radius;
    private String color = "Unknown"; // Mặc định màu sắc

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

}
