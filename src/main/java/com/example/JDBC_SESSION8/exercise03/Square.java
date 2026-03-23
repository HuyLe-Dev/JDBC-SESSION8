package main.java.com.example.JDBC_SESSION8.exercise03;

public class Square implements Colorable {
    private final double side;
    private String color = "Unknown";

    public Square(double side) {
        this.side = side;
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
