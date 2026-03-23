package main.java.com.example.JDBC_SESSION8.exercise07;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        this.bonus = 0.0;
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String toString() {
        // Tái sử dụng toString của lớp cha, chỉ nối thêm phần riêng của lớp con
        return super.toString() + String.format(", Tiền thưởng: %,.0f, TỔNG LƯƠNG: %,.0f (Manager)",
                this.bonus, this.getSalary());
    }
}