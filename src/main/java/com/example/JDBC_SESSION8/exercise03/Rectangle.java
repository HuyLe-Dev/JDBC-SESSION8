package main.java.com.example.JDBC_SESSION8.exercise03;

public class Rectangle implements Colorable {
    private final double length;
    private final double width;
    private String color = "Unknown";

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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
