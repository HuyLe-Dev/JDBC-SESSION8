package main.java.com.example.JDBC_SESSION8.exercise07;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {}

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void increaseSalary(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền tăng phải lớn hơn 0");
        }
        this.salary += amount;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return String.format("Mã NV: %s, Tên: %s, Lương CB: %,.0f", id, name, salary);
    }
}